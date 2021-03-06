import org.antlr.v4.misc.OrderedHashMap;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.util.Map;

public class TestPropertyFile {
    public static class PropertyFileLoader extends PropertyFileBaseListener {
        Map<String,String> props = new OrderedHashMap<String, String>();
        public void exitProp(PropertyFileParser.PropContext ctx) {
            String id = ctx.ID().getText(); // prop : ID '=' STRING '\n' ;
            String value = ctx.STRING().getText();
            props.put(id, value);
        }
    }

    public static class PropertyFileVisitor extends PropertyFileBaseVisitor<Void>
    {
        Map<String,String> props = new OrderedHashMap<String, String>(); public Void visitProp(PropertyFileParser.PropContext ctx) {
        String id = ctx.ID().getText(); // prop : ID '=' STRING '\n' ;
        String value = ctx.STRING().getText();
        props.put(id, value);
        return null; // Java says must return something even when Void
    } }

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);
        PropertyFileLexer lexer = new PropertyFileLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PropertyFileParser parser = new PropertyFileParser(tokens);
        ParseTree tree = parser.file();

//        // create a standard ANTLR parse tree walker
//        ParseTreeWalker walker = new ParseTreeWalker();
//        // create listener then feed to walker
//        PropertyFileLoader loader = new PropertyFileLoader();
//        walker.walk((ParseTreeListener) loader, tree);        // walk parse tree
        PropertyFileVisitor loader = new PropertyFileVisitor();
        loader.visit(tree);
        System.out.println(loader.props); // print results
    }
}
