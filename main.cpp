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
  
  ANTLRInputStream input(testFile);
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
  std::cout << "Done" << std::endl;

  // std::cout << tree->toStringTree(&parser) << std::endl << std::endl;

  return 0;
}
