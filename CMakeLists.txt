# minimum required CMAKE version
CMAKE_MINIMUM_REQUIRED(VERSION 3.7 FATAL_ERROR)

list(APPEND CMAKE_MODULE_PATH ${CMAKE_CURRENT_SOURCE_DIR}/cmake)

# compiler must be 11 or 14
set(CMAKE_CXX_STANDARD 17)

# required if linking to static library
add_definitions(-DANTLR4CPP_STATIC)

# using /MD flag for antlr4_runtime (for Visual C++ compilers only)
set(ANTLR4_WITH_STATIC_CRT OFF)
# add external build for antlrcpp
include(ExternalAntlr4Cpp)
# add antrl4cpp artifacts to project environment
include_directories(${ANTLR4_INCLUDE_DIRS})

# set variable pointing to the antlr tool that supports C++
# this is not required if the jar file can be found under PATH environment
set(ANTLR_EXECUTABLE /home/jeff/Downloads/antlr-4.8-complete.jar)
# add macros to generate ANTLR Cpp code from grammar
find_package(ANTLR REQUIRED)


antlr_target(SampleGrammarParser Sentinel.g4 VISITOR
             PACKAGE antlrcpptest)

include_directories(${ANTLR_SampleGrammarParser_OUTPUT_DIR})
include_directories(visitor values)

list(APPEND visitors 
    visitor/BuildAstVisitor.cpp
    )

list(APPEND values
    values/SentinelValue.cpp
    values/DoubleValue.cpp
    values/IntValue.cpp)


add_executable(demo main.cpp
               ${ANTLR_SampleGrammarParser_CXX_OUTPUTS}
               ${visitors}
               ${values})

target_link_libraries(demo antlr4_static)
