#pragma once
#include <ExpressionNode.h>

class NumberNode : public ExpressionNode {

        public:
            double value;
            NumberNode(double value);
};
