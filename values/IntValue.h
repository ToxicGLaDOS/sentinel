/*
 * Declarations for IntValue
 *
 * IntValue is a subclass of SentinelValue. It represents a
 * int in sentinel. IntValue defines how ints interact with other
 * SentinelValues in sentinel by overriding the pure virtual methods of SentinelValue e.g. add().
*/

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