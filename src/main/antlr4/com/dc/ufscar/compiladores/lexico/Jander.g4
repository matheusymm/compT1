lexer grammar Jander;

ALGORITMO : 'algoritmo';
DECLARE : 'declare';
LITERAL : 'literal';
INTEIRO : 'inteiro';
REAL : 'real';
LOGICO : 'logico';
LEIA : 'leia';
ESCREVA : 'escreva';
SE : 'se';
FIM_SE : 'fim_se';
ENTAO: 'entao';
CASO : 'caso';
SEJA : 'seja';
SENAO : 'senao';
FIM_CASO : 'fim_caso';
PARA : 'para';
ATE : 'ate';
FACA : 'faca';
FIM_PARA : 'fim_para';
ENQUANTO : 'enquanto';
FIM_ENQUANTO : 'fim_enquanto';
REGISTRO : 'registro';
FIM_REGISTRO : 'fim_registro';
TIPO : 'tipo';
PROCEDIMENTO : 'procedimento';
FIM_PROCEDIMENTO : 'fim_procedimento';
VAR : 'var';
FUNCAO : 'funcao';
RETORNE : 'retorne';
FIM_FUNCAO : 'fim_funcao';
CONSTANTE : 'constante';
VERDADEIRO : 'verdadeiro';
FALSO : 'falso';
FIM_ALGORITMO : 'fim_algoritmo';

NUM_INT	: ('0'..'9')+
	;
NUM_REAL	: ('0'..'9')+ ('.' ('0'..'9')+)?
	;
OP_LOGICO	: 'e' | 'ou' | 'nao'
	;
IDENT : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* 
	 ;  
PONTUACAO	: ',' | '..' | '<-' | '^' | '&' | '.'
	;
CADEIA 	: '"' ( ESC_SEQ | ~('\n'|'\''|'\\'|'"') )* '"'
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
OP_ARIT	:	'+' | '-' | '*' | '/' | '%'
	;
DELIM	:	':'
	;
ABREPAR :	'('
	;
FECHAPAR:	')'
	;
ABRECHAVE : '['
	;
FECHACHAVE : ']'
	;

COMENTARIO_NAO_FECHADO:   '{' ~('}'|'\n')* '\n' 
    ;
CADEIA_NAO_FECHADA: '"' ( ESC_SEQ | ~('\n'|'\''|'\\'|'"') )* '\n'
	;
ERRO: .;