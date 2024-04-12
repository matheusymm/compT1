lexer grammar Jander;

ALGORITMO : 'algoritmo';
DECLARE : 'declare';
LITERAL : 'literal';
INTEIRO : 'inteiro';
REAL : 'real';
LOGICO : 'logico';
LEIA : 'leia';
ESCREVA : 'escreva';
RAIZ : 'raiz';
SEN : 'sen';
COS : 'cos';
TAN : 'tan';
ASEN : 'asen';
ACOS : 'acos';
ATAN : 'atan';
LN : 'ln';
LOG : 'log';
EXP : 'exp';
POT : 'pot';
SINAL : 'sinal';
TRUNCA : 'trunca';
INT : 'int';
FRAC : 'frac';
ARRED : 'arred';
ABS : 'abs';
RESTO : 'resto';
QUOC : 'quoc';
COMPRLITERAL : 'comprLiteral';
POSLITERAL : 'posLiteral';
VALLITERAL : 'valLiteral';
CASO : 'caso';
SEJA : 'seja';
SENAO : 'senao';
FIM_CASO : 'fim_caso';
FIM_ALGORITMO : 'fim_algoritmo';

NUM_INT	: ('+'|'-')?('0'..'9')+
	;
NUM_REAL	: ('+'|'-')?('0'..'9')+ ('.' ('0'..'9')+)?
	;
OP_LOGICO	: 'e' | 'ou' | 'nao'
	;
IDENT : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
	 ;  
PONTUACAO	: ',' | '..' | '<-'
	;
CADEIA 	: '"' ( ESC_SEQ | ~('\''|'\\'|'"') )* '"'
	;

fragment
ESC_SEQ	: '\\\'';
COMENTARIO
    :   '{' ~('}'|'\n')* '}' {skip();}
    ;
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;
OP_REL	:	'>' | '>=' | '<' | '<=' | '<>' | '='
	;
OP_ARIT	:	'+' | '-' | '*' | '/'
	;
DELIM	:	':'
	;
ABREPAR :	'('
	;
FECHAPAR:	')'
	;