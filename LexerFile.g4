lexer grammar LexerFile ;

options { superClass=LexerFile; }

VAR : 'var';
LET : 'let';
CONST : 'const';
IMPORT : 'import';
FROM : 'from';
EXPORT : 'export';
DEFAULT : 'default';
RETURN : 'return';
NULL_VALUE : 'null';
FUNCTION : 'function';



ID : [a-zA-Z_] [a-zA-Z0-9_]*;
NUMBER : [1-9][0-9]*;



SINGLE_QUOTE_STRING : '\''~[']* '\'';
DOUBLE_QUOTE_STRING : '"'~[']*'"';
LARGER_THAN : '>';
LEES_THAN : '<';
SLASH : '/';
COMPONENT_NAME : [A-Z][a-zA-Z0-9]*;
AND : '&&';
EQUAL : '=';
ARROW_FUNCTION : '=>';
OPEN_PAREN: '(';
CLOSE_PAREN : ')';
LSQUAR : '[';
RSQUAR : ']';
OPEN_CURLY_BRACKETS : '{';
CLOSE_CURLY_BRACKETS : '}';
SIMI : ';';
COLON : ':';
COMMA : ',';
DOT : '.';
SPACE : [ \n\t\r]+ -> skip ;


USE_STATE : 'useState' ;
USE_REF : 'useRef' ;