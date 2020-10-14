#include "Scope.h"


Scope::Scope(){}


bool Scope::hasValue(const std::string& varName) const {
    // Compare result of find to end of iterator
    // If we hit the end of the iterator then we didn't find it so return false
    bool thisContains = variables.find(varName) != variables.end();
    if (!thisContains){
        return parent->hasValue(varName);
    }
    else{
        return true;
    }
}

std::shared_ptr<SentinelValue> Scope::getValue(const std::string& varName) const {
    auto it = variables.find(varName);

    if (it != variables.end()){
        // Second means the second in the key-value pair i.e. the value
        return it->second;
    }
    else if (parent != nullptr){
        return parent->getValue(varName);
    }
    else {
        throw std::runtime_error("Access to undefined variable \"" + varName + "\".");
    }
}

void Scope::setValue(std::string varName, std::shared_ptr<SentinelValue> value){
    variables.emplace(varName, value);
}

