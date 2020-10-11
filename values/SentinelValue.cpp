#include "SentinelValue.h"


SentinelValue::SentinelValue(SentinelValue::types type, std::variant<double> value)
    : type(type)
    , value(value){}