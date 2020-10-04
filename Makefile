.PHONY: build run clean antlr


help:  ## Prints this help message
	@cat Makefile | grep -E ".*:\s*##"
build: ## Compiles the .java files and places the results in comp/
ifndef antlr4_jar
	    @echo "Please define absolute path to antlr4 jar in antlr4_jar variable either through environment or -e flag"
else
	    javac -classpath $(antlr4_jar) -d comp/ src/antlr/*.java src/pizza/blackolivepineapple/sentinel/*/*.java
endif

run:   ## Runs the sentinel interpreter
ifndef antlr4_jar
	    @echo "Please define absolute path to antlr4 jar in antlr4_jar variable either through environment or -e flag"
else
	    java -classpath ./comp/:$(antlr4_jar) pizza.blackolivepineapple.sentinel.run.Program
endif

antlr: ## Generates the antlr code (Lexer, Parser, Tokenizer...)
ifndef antlr4_jar
	    @echo "Please define absolute path to antlr4 jar in antlr4_jar variable either through environment or -e flag"
else
	    java -jar $(antlr4_jar) -visitor -package antlr src/antlr/Sentinel.g4
endif

grun:  ## Runs the antlr test rig. Accepts TEST_FILE and GRUN_OPTS variables. TEST_FILE is the .sen file to try to parse. GRUN_OPTS are the options to pass to grun
ifndef antlr4_jar
	    @echo "Please define absolute path to antlr4 jar in antlr4_jar variable either through environment or -e flag"
else
	    java -cp $$(pwd)/comp:$(antlr4_jar) org.antlr.v4.gui.TestRig antlr.Sentinel program $(TEST_FILE) $(GRUN_OPTS)
endif

clean: ## Deletes all complied files and antlr generated code
	rm -r comp/ && rm src/antlr/*.java src/antlr/*.interp src/antlr/*.tokens
