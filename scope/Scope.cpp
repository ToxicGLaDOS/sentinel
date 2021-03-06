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
    // If the variable already exists
    if (variables.find(varName) != variables.end()){
        // shared_from_this is inherited from std::enable_shared_from_this
        // and allows us to generate smart pointers as this pointers
        variables[varName]->callWatchers(shared_from_this());
    }
    variables.emplace(varName, value);
}


void Scope::defineWatcher(const std::string& watcherName, antlrcpptest::SentinelParser::TwoParamWatcherDefContext* contextTree){
    watchers.emplace(watcherName, contextTree);
}

void Scope::addWatcherToVariable(const std::string& watcherName, const std::string& variableName){
    if (variables.find(variableName) == variables.end()){
        throw std::runtime_error("Tried to watch an undefined variable.");
    }
    if (watchers.find(watcherName) == watchers.end()){
        throw std::runtime_error("Tried to watch with an undefined watcher.");
    }
    auto value = variables[variableName];
    auto watcher = watchers[watcherName];
    value->addWatcher(watcher);
}
