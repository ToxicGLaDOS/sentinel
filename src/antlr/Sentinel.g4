grammar Sentinel;

program
    :   statement* EOF
    ;

statement
    : watcherName=ID '(' type=ID varName0=ID ',' type=ID varName1=ID ')' '{' statement* '}' # twoParamWatcherDef
    | ID '(' ID ID ')' '{' statement* '}'                                               # oneParamWatcherDef
    | ID 'watches' WATCHABLE_ID                                                         # watchesStatement
    //| 'if' '(' expr ')' '{' statement* '}'                                            # ifStatement
    | typeName=ID varName=ID '=' (varNameOther=ID | literalValue=LITERAL)               # equalStatement
    ;

expr
    :   '(' expr ')'                         # parensExpr
    |   op=('+'|'-') expr                    # unaryExpr
    |   left=expr op=('*'|'/') right=expr    # infixExpr
    |   left=expr op=('+'|'-') right=expr    # infixExpr
    |   value=NUM                            # numberExpr
    ;

OP_ADD: '+';
OP_SUB: '-';
OP_MUL: '*';
OP_DIV: '/';

LITERAL : INT_LITERAL | FLOAT_LITERAL | STRING_LITERAL;
INT_LITERAL : [0-9]+;
FLOAT_LITERAL :   [0-9]+ '.' [0-9]+ ([eE] [+-]? [0-9]+)?;
STRING_LITERAL : '"' .*? '"';
NUM : INT_LITERAL | FLOAT_LITERAL;
ID  :   [a-zA-Z_]+[a-zA-Z0-9_]*;
WATCHABLE_ID : ID ('[' (STRING_LITERAL | INT_LITERAL | FLOAT_LITERAL | ID ) ']' )?;

WS  :   [ \t\r\n] -> channel(HIDDEN);