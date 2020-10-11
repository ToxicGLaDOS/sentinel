#pragma once
#include "SentinelValue.h"
#include "IntValue.h"

class IntValue;

class DoubleValue : public SentinelValue {
    public:
        double value;

        DoubleValue(double value);
        virtual std::shared_ptr<SentinelValue> add(const SentinelValue& other) const;
        std::shared_ptr<SentinelValue> add(const DoubleValue& other) const;
        std::shared_ptr<SentinelValue> add(const IntValue& other) const;

        std::string toString() const;
};