grammar Sentinel;

program
    :   statement* EOF
    ;

statement
    : watcherName=ID LEFT_PAREN type=ID varName0=ID COMMA type=ID varName1=ID RIGHT_PAREN LEFT_BRACKET statement* RIGHT_BRACKET # twoParamWatcherDef
    //| ID '(' ID ID ')' '{' statement* '}'                                               # oneParamWatcherDef
    | watcherName=ID WATCHES watchable=ID                                                         # watchesDeclStatement
    //| 'if' '(' expr ')' '{' statement* '}'                                            # ifStatement
    | varName=ID EQUALS expression=expr                                                    # equalStatement
    | typeName=ID varName=ID EQUALS expression=expr                                                           # variableDeclStatement
    ;

expr
    :   '(' expr ')'                         # parensExpr
    |   op=('+'|'-') expr                    # unaryExpr
    |   left=expr op=('*'|'/') right=expr    # infixExpr
    |   left=expr op=('+'|'-') right=expr    # infixExpr
    |   value=LITERAL                            # numberExpr
    ;

OP_ADD: '+';
OP_SUB: '-';
OP_MUL: '*';
OP_DIV: '/';
WATCHES: 'watches';
EQUALS: '=';
LEFT_PAREN: '(';
RIGHT_PAREN: ')';
LEFT_BRACKET: '{';
RIGHT_BRACKET: '}';
COMMA: ',';

LITERAL : INT_LITERAL | FLOAT_LITERAL | STRING_LITERAL;
NUM : INT_LITERAL | FLOAT_LITERAL;
ID  :   [a-zA-Z_]+[a-zA-Z0-9_]*;
WATCHABLE_ID : ID ('[' (STRING_LITERAL | INT_LITERAL | FLOAT_LITERAL | ID ) ']' )?;
fragment INT_LITERAL : [0-9]+;
fragment FLOAT_LITERAL :   [0-9]+ '.' [0-9]+ ([eE] [+-]? [0-9]+)?;
fragment STRING_LITERAL : '"' .*? '"';


WS  :   [ \t\r\n] -> channel(HIDDEN);