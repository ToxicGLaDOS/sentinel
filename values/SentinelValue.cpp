/*
 * Definitions for SentinelValue
 *
 * See SentinelValue.h for more information
*/

#include "SentinelValue.h"
#include <iostream>
#include "ExecuteVisitor.h"

SentinelValue::SentinelValue(SentinelValue::types type)
    : type(type){}

void SentinelValue::addWatcher(antlrcpptest::SentinelParser::TwoParamWatcherDefContext* watcher) {
    watchers.push_back(watcher);
}

void SentinelValue::callWatchers(std::shared_ptr<Scope> parentScope) {
    ExecuteVisitor executeVisitor(parentScope);
    for(auto context : watchers){
        executeVisitor.visitChildren(context);
    }
}

bool SentinelValue::isDouble() const{
    return type == SentinelValue::DOUBLE;
}

bool SentinelValue::isInt() const{
    return type == SentinelValue::INT;
}

bool SentinelValue::isNumber() const{
    return isDouble() || isInt();
}
