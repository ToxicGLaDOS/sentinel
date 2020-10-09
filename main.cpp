/* Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

//
//  main.cpp
//  antlr4-cpp-demo
//
//  Created by Mike Lischke on 13.03.16.
//

#include <iostream>
#include <fstream>

#include "antlr4-runtime.h"
#include "SentinelLexer.h"
#include "SentinelParser.h"

#include "BuildAstVisitor.h"


using namespace antlrcpptest;
using namespace antlr4;

int main(int , const char **) {
  std::ifstream testFile;
  testFile.open("../test.sen");
  std::string line, file;
  if (testFile.is_open()){
    while( getline (testFile, line)){
      file += line + '\n';
    }
    testFile.close();
  }
  else {
    std::cout << "Cannot open test.sen" << '\n';
  }
  
  std::cout << "File: ";
  std::cout << file << '\n';

  ANTLRInputStream input(file);
  SentinelLexer lexer(&input);
  CommonTokenStream tokens(&lexer);

  tokens.fill();
  for (auto token : tokens.getTokens()) {
    std::cout << token->toString() << std::endl;
  }

  SentinelParser parser(&tokens);
  antlrcpptest::SentinelParser::ProgramContext* cst = parser.program();
  BuildAstVisitor ast;
  ast.visitProgram(cst);
  //EvaluateProgramVisitor program(ast);

  // std::cout << tree->toStringTree(&parser) << std::endl << std::endl;

  return 0;
}
