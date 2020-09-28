grammar Sentinel;

program
    :   statement* EOF
    ;

statement
    : ID '(' ID ID ID ID ')' '{' statement* '}' # twoParamWatcher
    | ID '(' ID ID ')' '{' statement* '}'       # oneParamWatcher
    | ID 'watches' WATCHABLE_ID                 # watchesStatment
    ;

expr
    :   '(' expr ')'                         # parensExpr
    |   op=('+'|'-') expr                    # unaryExpr
    |   left=expr op=('*'|'/') right=expr    # infixExpr
    |   left=expr op=('+'|'-') right=expr    # infixExpr
    |   func=ID '(' expr ')'                 # funcExpr
    |   value=NUM                            # numberExpr
    ;

OP_ADD: '+';
OP_SUB: '-';
OP_MUL: '*';
OP_DIV: '/';

NUM :   [0-9]+ ('.' [0-9]+)? ([eE] [+-]? [0-9]+)?;
ID  :   [a-zA-Z]+;
WATCHABLE_ID : ID ('[' (STRING_LITERAL | ID) ']' )?;
STRING_LITERAL : '"' .*? '"';
WS  :   [ \t\r\n] -> channel(HIDDEN);