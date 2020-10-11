#pragma once
#include "SentinelValue.h"

class DoubleValue : public SentinelValue {
    public:
        double value;

        DoubleValue(double value);
        virtual std::shared_ptr<SentinelValue> add(const SentinelValue& other) const;
        std::shared_ptr<SentinelValue> add(const DoubleValue& other) const;
};