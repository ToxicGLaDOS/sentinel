## What is it?
A really simple calculator that's powered by antlr4 to demonstrate how to create an AST using antlr4. This is basically a java translation of the stackoverflow answer [here](https://stackoverflow.com/a/29996191)

## Requirements

1. java jdk
2. antlr4 jar (found [here](https://www.antlr.org/download/antlr-runtime-4.8.jar))
3. make

## Building

```
make -e antlr4_jar=/path/to/antlr4_jar build
make -e antlr4_jar=/path/to/antlr4_jar run
```
