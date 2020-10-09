#include "EvaluateExpressionVisitor.h"

double EvaluateExpressionVistior::visit(NumberNode node) {
        return node.value;
}