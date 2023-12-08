lexer grammar LexerFile ;

options { superClass=LexerFile; }

COMMA: ',';
OPEN_SQUARE: '[';
OPEN_BRACE: '{';
OPEN_PAREN: '(';
CLOSE_SQUARE: ']';
CLOSE_BRACE: '}';
CLOSE_PAREN: ')';
COLON: ':';
DOT: '.';
ARROW: '=>';
EQUAL: '=';
MINUS: '-';
NEQUAL: '=!';
NOT: '!';
OR: '||';
AND: '&&';
PLUS: '+';
PLE: '+=';
PLPL: '++';
QUESTION: '?';
SIME: ';';
MULTI: '*';
S_C: '\'' ;
D_C : '"';

EXPENSES:'expenses';
CONST: 'const';
FUNCTION: 'function';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
CLASS: 'class';
VAR: 'var';
LET: 'let';
EXPORT: 'export' ;
DEFAULT: 'default';
IMPORT: 'import';
DOCUMNET: 'document';
FROM: 'from';

JSX_OPEN: '<';
JSX_CLOSE: '>';
JSX_SLASH: '/';

WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]*;

TYPE: 'type';
BROWSER_ROUTER: 'BrowserRouter';
ROUTER: 'Router';
SWITCH: 'Switch';
DATATYPE_:'string' |'number';
REACT_:'React' ;
CREATEELEMENT : 'createElement';
REACTDOM: 'ReacttDOM';
USESTATE_:'useState';
USEEFFECT_:'useEffect';
USEREF_:'useRef';
CONSOLE_:'console';
LOG_:'log';
INPUT_:'input';
ONCHANGE_:'onChange';
VALUE_:'value';
PLACEHOLDER_:'placeholder';
DISABLED_:'disabled ';
ONFOCUS_:'onFocus';
ONCLICK_:'onclick';
IMG_:'img' ;
SRC:'src' ;
HEIGHT: 'height';
WIDTH: 'width';
BUTTON_:'button';
MAP_:'map';
CLASS_NAME:'className';

OPERATION:PLUS|MINUS|PLPL|'--'|PLE|'-='|MULTI|'==';
SYNTAX : 'div' |'li' |'p' |'ul' |SIZE_FONT | 'main' | BROWSER_ROUTER | SWITCH | ROUTER;
//FUNCTION_NAME : WORD+  ;
NUMBER:DIGIT+;
STRING: '\'' (~["])* '\'';
HEX_NUMBER : '0x' HEX_DIGIT+ | '0X' HEX_DIGIT+ ;


fragment WORD: LETTER | '_' | DIGIT  ;
fragment LETTER : 'a' .. 'z' | 'A' .. 'Z'  ;
fragment DIGIT : '0' .. '9' ;
SingleLineString : StringDQ | StringSQ | 'r\'' (~('\'' | '\n' | '\r'))* '\'' | 'r"' (~('"' | '\n' | '\r'))* '"' ;
MultiLineString : '"""' StringContentTDQ*? '"""' | '\'\'\'' StringContentTSQ*? '\'\'\'' | 'r"""' (~'"' | '"' ~'"' | '""' ~'"')* '"""' | 'r\'\'\'' (~'\'' | '\'' ~'\'' | '\'\'' ~'\'')* '\'\'\'' ;
fragment StringDQ : '"' StringContentDQ*? '"' ;
fragment StringContentDQ : ~('\\' | '"' | '\n' | '\r' | '$') | '\\' ~('\n' | '\r') | StringDQ | '${' StringContentDQ*? '}' | '$' { CheckNotOpenBrace() }? ;
fragment StringSQ : '\'' StringContentSQ*? '\'' ;
fragment StringContentSQ : ~('\\' | '\'' | '\n' | '\r' | '$') | '\\' ~('\n' | '\r') | StringSQ | '${' StringContentSQ*? '}' | '$' { CheckNotOpenBrace() }? ;
fragment StringContentTDQ : ~('\\' | '"') | '"' ~'"' | '""' ~'"' ;
fragment StringContentTSQ : '\'' ~'\'' | '\'\'' ~'\'' | . ;
fragment HEX_DIGIT : 'a' .. 'f' | 'A' .. 'F' | DIGIT ;
fragment SIZE_FONT : 'h1'|'h2'|'h3'|'h4'|'h5'|'h6' ;
fragment NEWLINE : '\n' | '\r' | '\r\n' ;
fragment TEXT:WORD+;
ID: [a-zA-Z_][a-zA-Z0-9_]*;