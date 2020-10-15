#pragma once
#include "SentinelValue.h"
#include "SentinelParser.h"
#include <unordered_map>
#include <memory>

class SentinelValue;

class Scope : public std::enable_shared_from_this<Scope>{
    std::unordered_map<std::string, std::shared_ptr<SentinelValue>> variables;
    std::unordered_map<std::string, antlrcpptest::SentinelParser::TwoParamWatcherDefContext*> watchers;
    std::shared_ptr<Scope> parent;

    public:
        Scope();
        bool hasValue(const std::string& varName) const;
        std::shared_ptr<SentinelValue> getValue(const std::string& varName) const;
        void setValue(std::string varName, std::shared_ptr<SentinelValue> value);

        void defineWatcher(const std::string& watcherName, antlrcpptest::SentinelParser::TwoParamWatcherDefContext* contextTree);

        void addWatcherToVariable(const std::string& watcherName, const std::string& variableName);

};