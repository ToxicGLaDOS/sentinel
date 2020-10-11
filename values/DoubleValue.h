/*
 * Declarations for DoubleValue
 *
 * DoubleValue is a subclass of SentinelValue. It represents a
 * double in sentinel. DoubleValue defines how doubles interact with other
 * SentinelValues in sentinel by overriding the pure virtual methods of SentinelValue e.g. add().
*/

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