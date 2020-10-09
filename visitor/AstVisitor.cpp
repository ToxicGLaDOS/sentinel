#include <AstVisitor.h>
#include <AstNode.h>
#include <stdexcept>
#include <iostream>

template <class T>
T AstVisitor<T>::visit(AstNode node){
    std::cout << "Visit!" << std::endl;
    if (NumberNode* numNode = dynamic_cast<NumberNode*>(node)){
        std::cout << "Successful cast" << std::endl;
        return this.visit(numNode);
    }
    else{
        std::cout << "Unsuccessful cast" << std::endl;
        throw std::invalid_argument( "Node not of known type :(" );
    }
    std::cout << "Unsuccessful cast" << std::endl;
}