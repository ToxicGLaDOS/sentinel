#include "DoubleValue.h"


DoubleValue::DoubleValue(double value)
    : SentinelValue(SentinelValue::DOUBLE)
    , value(value){}

std::shared_ptr<SentinelValue> DoubleValue::add(const SentinelValue& other) const{
    if(other.isDouble()){
        // Not sure if we want to use static_cast or dynamic_cast here.
        // static_cast *should* be safe because we do our own type checking e.g. if(other.isDouble())
        return add(static_cast<const DoubleValue&>(other));
    }
}

std::shared_ptr<SentinelValue> DoubleValue::add(const DoubleValue& other) const{
    return std::make_shared<DoubleValue>(value + other.value);
}