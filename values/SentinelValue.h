/*
 * Declarations for SentinelValue
 *
 * SentinelValue is the base class for all data within sentinel
 * If you have an int in sentinel then you have a subclass of SentinelValue
 * representing that int.
 *
 * Operators between SentinelValues are pure virtual methods here
 * and to be defined by the subclasses of SentinelValue (e.g. IntValue).
 *
 * The actual data should be stored in the subclass. This class only keeps track of the sentinel type
 * and defines methods to be used/overriden by subclasses.
*/

#pragma once
#include <memory>

class SentinelValue {
    public:
        enum types {DOUBLE, INT};
        SentinelValue::types type;

        SentinelValue(SentinelValue::types type);

        /*
         * These pure virtual methods are used instead of operator overloading because operators cannot be polymorphic.
         *
         * We return a pointer because SentinelValue has pure virtual methods so it can't be instantiated.
        */
        virtual std::shared_ptr<SentinelValue> add(const SentinelValue& other) const = 0;


        bool isNumber() const;
        bool isDouble() const;
        bool isInt() const;

        virtual std::string toString() const = 0;

};