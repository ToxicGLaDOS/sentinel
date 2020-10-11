#pragma once
#include <variant>

class SentinelValue {
    // Alias SentinelType to basically the union of all the valid internal types
    using SentinelType = std::variant<double>;
    public:
        enum types {DOUBLE};
        SentinelValue::types type;
        SentinelType value;

        SentinelValue(SentinelValue::types type, SentinelType value);


};