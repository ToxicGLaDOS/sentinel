#pragma once
#include <variant>
#include <memory>

class SentinelValue {
    public:
        enum types {DOUBLE, INT};
        SentinelValue::types type;

        SentinelValue(SentinelValue::types type);

        // This is used instead of operator overloading because operators cannot be polymorphic
        virtual std::shared_ptr<SentinelValue> add(const SentinelValue& other) const = 0;

        bool isNumber() const;
        bool isDouble() const;
        bool isInt() const;


};