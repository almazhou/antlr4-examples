grammar Aml;

file : entity+
;

entity : 'puid' name = INT ('extends' name = ID)? '{'
        block+
'}'
;

block : (keyString | keyInt | network | avail)+
;

keyString :  name = ID '=' value = ID ';'
;

keyInt : name = ID '=' value = (DECIMAL | INT) ';'
;

network : name = ID '=' value = ID (','ID)+ ';'
;

avail : name = ID '=' value = STRING(',' STRING) ';'
;

DECIMAL : INT '.' (INT)+
;

ID : [a-zA-Z]+;

INT : [0-9]+;

STRING: '"' .*? '"' ;

WS : [ \t\r\n]+ -> skip ;

