/*
 * Definitions for IntValue
 *
 * See IntValue.h for more information
*/


#include "IntValue.h"


IntValue::IntValue(int value)
    : SentinelValue(SentinelValue::INT)
    , value(value){}

std::shared_ptr<SentinelValue> IntValue::add(const SentinelValue& other) const{
    if(other.isInt()){
        // Not sure if we want to use static_cast or dynamic_cast here.
        // static_cast *should* be safe because we do our own type checking e.g. if(other.isDouble())
        return add(static_cast<const IntValue&>(other));
    }
    else if(other.isDouble()){
        return add(static_cast<const DoubleValue&>(other));
    }
    throw std::runtime_error("Tried to add int to something you can't add an int to.");
}

std::shared_ptr<SentinelValue> IntValue::add(const IntValue& other) const{
    return std::make_shared<IntValue>(value + other.value);
}

std::shared_ptr<SentinelValue> IntValue::add(const DoubleValue& other) const{
    return std::make_shared<DoubleValue>(value + other.value);
}

std::string IntValue::toString() const {
    return std::to_string(value);
}