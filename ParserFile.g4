parser grammar ParserFile ;

options  {tokenVocab=LexerFile;}

app : function3;
export : EXPORT DEFAULT ID SIME ;
importR:IMPORT ((USESTATE_ | USEREF_ | USEEFFECT_ |ID | REACT_)  COMMA)* OPEN_BRACE? (USESTATE_ | USEREF_ | USEEFFECT_ | ID | REACT_)( COMMA ID)* CLOSE_BRACE? FROM  STRING SIME;

variableDiclaration : (VAR | CONST | LET) ID EQUAL (function2 | NUMBER | useRef ) SIME? ;
html: JSX_OPEN (SYNTAX) (ID EQUAL OPEN_BRACE attributeValue CLOSE_BRACE)* JSX_CLOSE (html* | ID*) JSX_OPEN JSX_SLASH SYNTAX JSX_CLOSE ;

variable : (VAR | CONST | LET) ;

print : CONSOLE_ DOT LOG_ OPEN_PAREN (ID | SingleLineString  | NUMBER)* CLOSE_PAREN SIME ;

function1 : variable ID OPEN_PAREN ID* CLOSE_PAREN OPEN_BRACE functionbody CLOSE_BRACE ;
function2 : OPEN_PAREN ID*  CLOSE_PAREN ARROW OPEN_BRACE functionbody CLOSE_BRACE ;
function3 : variable ID EQUAL OPEN_PAREN ID* CLOSE_PAREN ARROW OPEN_BRACE functionbody CLOSE_BRACE ;

functionbody : (variableDiclaration | print | useEffect | useState)* returnStatment? ;

returnStatment : returnStatment1 | RETURN pureReact;

returnStatment1 : RETURN OPEN_PAREN html? CLOSE_PAREN SIME ;

syntax: S_C SYNTAX S_C ;

pureReact : REACT_ DOT CREATEELEMENT OPEN_PAREN
(STRING | ID) COMMA attributes COMMA?
((pureReact | SingleLineString)* COMMA?)? CLOSE_PAREN (SIME | COMMA);

attributes: OPEN_BRACE attribute? (COMMA attribute)* CLOSE_BRACE;

attribute: attributeName=ID COLON attributeValue
         | attributeName=ID COLON attributeValue
         | attributeName=ID COLON attributeValue;

attributeValue: STRING
              | NUMBER
              | ID;

useRef : USEREF_ OPEN_PAREN (STRING)* CLOSE_PAREN ;

useState : variable OPEN_SQUARE ID COMMA ID CLOSE_SQUARE EQUAL USESTATE_ OPEN_PAREN attributeValue  CLOSE_PAREN  SIME;

array : (VAR | CONST | LET) arrayy EQUAL useState SIME ;

functionCall : ID OPEN_PAREN (STRING)? CLOSE_PAREN ;

useEffect : USEEFFECT_ OPEN_PAREN function2 COMMA  arrayy CLOSE_PAREN SIME ;

arrayy : OPEN_SQUARE (ID COMMA?)* CLOSE_SQUARE ;