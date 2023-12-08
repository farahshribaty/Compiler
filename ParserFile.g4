parser grammar ParserFile ;

options  {tokenVocab=LexerFile;}

program : (importStatment)* statemtn* export?;

export : EXPORT DEFAULT? ID;

statemtn : ( variableDiclaration | functionDeclaration | objectAssign | objectDefnation | arrayDefnation | constDeclartion | objectAccess | functionCall)+;

functionDeclaration : FUNCTION ID OPEN_PAREN (ID (COMMA ID)*)? CLOSE_PAREN functionBody ;

variableDiclaration : (VAR | CONST | LET) ID EQUAL (function2 | NUMBER | useRef ) SIMI? ;

useRef : USE_REF OPEN_PAREN (SINGLE_QUOTE_STRING)* CLOSE_PAREN ;

function2 : OPEN_PAREN ID*  CLOSE_PAREN ARROW_FUNCTION  functionBody  ;

objectAssign : ID COLON (ID | NUMBER | SINGLE_QUOTE_STRING) SIMI?;

objectDefnation : OPEN_CURLY_BRACKETS (objectAssign (COMMA objectAssign COMMA?)*)* CLOSE_CURLY_BRACKETS SIMI?;

arrayDefnation : LSQUAR (objectDefnation (COMMA objectDefnation COMMA?)*)* RSQUAR SIMI?;

constDeclartion : CONST (ID | ( LSQUAR ( ID (COMMA ID )*  )? RSQUAR )) EQUAL (SINGLE_QUOTE_STRING |DOUBLE_QUOTE_STRING | NUMBER | ID | arrayDefnation | objectDefnation | functionDefnetion | functionCall | xmlTag | objectAccess) SIMI? ;

functionDefnetion : OPEN_PAREN ( (ID (COMMA ID)* ) | (OPEN_CURLY_BRACKETS (ID (COMMA ID)*)? CLOSE_CURLY_BRACKETS) )? CLOSE_PAREN ARROW_FUNCTION functionBody;

functionBody : OPEN_CURLY_BRACKETS (statemtn)* returnStatment? CLOSE_CURLY_BRACKETS;

returnStatment : RETURN ( ( OPEN_PAREN (SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | NUMBER | ID | xmlTag) CLOSE_PAREN )
                            |
                            (SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | NUMBER | ID | xmlTag)
    ) SIMI? ;

importStatment : IMPORT
    (
        (DOUBLE_QUOTE_STRING | SINGLE_QUOTE_STRING)
        |
        (OPEN_CURLY_BRACKETS ID (COMMA ID)* CLOSE_CURLY_BRACKETS FROM (DOUBLE_QUOTE_STRING | SINGLE_QUOTE_STRING))
    )
    SIMI?;
functionCall : ID OPEN_PAREN ((arrayDefnation | objectDefnation | objectAccess | xmlTag | functionDefnetion | SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | ID | NUMBER | NULL_VALUE)?) CLOSE_PAREN SIMI?;

jsAttribute : OPEN_CURLY_BRACKETS (ID | objectAccess | functionDefnetion) CLOSE_CURLY_BRACKETS;

attributes : ID EQUAL (SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING | jsAttribute);

openTag : LEES_THAN ID (attributes)* LARGER_THAN;

closeTag : LEES_THAN SLASH ID LARGER_THAN;

justOpenTag : LEES_THAN ID (attributes)* SLASH LARGER_THAN;

xmlTag : (openTag (xmlTag | jsInJSX | ID )* closeTag ) | justOpenTag;

jsInJSX : OPEN_CURLY_BRACKETS (objectAccess | functionCall | shortIf)? CLOSE_CURLY_BRACKETS;

objectAccess : (ID | functionCall) DOT (functionCall | ID) (DOT (functionCall | ID))*;

shortIf : ID AND (ID | xmlTag);