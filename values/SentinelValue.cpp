#include "SentinelValue.h"
#include <iostream>
#include <variant>

SentinelValue::SentinelValue(SentinelValue::types type)
    : type(type){}


bool SentinelValue::isDouble() const{
    return type == SentinelValue::DOUBLE;
}

bool SentinelValue::isInt() const{
    return type == SentinelValue::INT;
}

bool SentinelValue::isNumber() const{
    return isDouble() || isInt();
}
