#pragma once
#include "SentinelValue.h"
#include <unordered_map>
#include <memory>

class Scope {
    std::unordered_map<std::string, std::shared_ptr<SentinelValue>> variables;
    std::shared_ptr<Scope> parent;

    public:
        Scope();
        bool hasValue(const std::string& varName) const;
        std::shared_ptr<SentinelValue> getValue(const std::string& varName) const;
        void setValue(std::string varName, std::shared_ptr<SentinelValue> value);


};