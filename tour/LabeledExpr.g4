grammar LabeledExpr;

import CommonLexerRules;

prog: stat+;

stat: expr NEWLINE 		# printExpr
	| ID '=' expr NEWLINE	# assign
	| NEWLINE				# black
	;

expr: expr ('*'|'/') expr # MulDiv
	| expr ('+'|'-') expr   # AddSub
	| INT					# int
	| ID					# id
	| '(' expr ')'			#parens
	;

MUL : '*';

DIV : '/';

ADD : '+';

SUB : '-';

