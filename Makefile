.PHONY: build
.PHONY: run
.PHONY: clean
.PHONY: antlr

build:
ifndef antlr4_jar
	    @echo "Please define absolute path to antlr4 jar in antlr4_jar variable either through environment or -e flag"
else
	    javac -cp $(antlr4_jar) -d comp/ src/antlr/*.java src/pizza/blackolivepineapple/calculator/*/*.java
endif
run:
ifndef antlr4_jar
	    @echo "Please define absolute path to antlr4 jar in antlr4_jar variable either through environment or -e flag"
else
	    java -classpath ./comp/:$(antlr4_jar) pizza.blackolivepineapple.calculator.run.Program
endif
antlr:
ifndef antlr4_jar
	    @echo "Please define absolute path to antlr4 jar in antlr4_jar variable either through environment or -e flag"
else
	    java -jar ~/Downloads/antlr-4.8-complete.jar -visitor -package antlr src/antlr/Sentinel.g4
endif
clean:
	rm -r comp/ && rm src/antlr/*.java src/antlr/*.interp src/antlr/*.tokens
