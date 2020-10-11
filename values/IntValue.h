#pragma once
#include "SentinelValue.h"
#include "DoubleValue.h"

class DoubleValue;

class IntValue : public SentinelValue {
    public:
        int value;

        IntValue(int value);
        virtual std::shared_ptr<SentinelValue> add(const SentinelValue& other) const;
        std::shared_ptr<SentinelValue> add(const IntValue& other) const;
        std::shared_ptr<SentinelValue> add(const DoubleValue& other) const;
        std::string toString() const;
};