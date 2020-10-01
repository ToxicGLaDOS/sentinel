.PHONY: build
.PHONY: run
.PHONY: clean
.PHONY: antlr


build:
ifndef antlr4_jar
	    @echo "Please define absolute path to antlr4 jar in antlr4_jar variable either through environment or -e flag"
else
	    javac -classpath $(antlr4_jar) -d comp/ src/antlr/*.java src/pizza/blackolivepineapple/sentinel/*/*.java
endif

run:
ifndef antlr4_jar
	    @echo "Please define absolute path to antlr4 jar in antlr4_jar variable either through environment or -e flag"
else
	    java -classpath ./comp/:$(antlr4_jar) pizza.blackolivepineapple.sentinel.run.Program
endif

antlr:
ifndef antlr4_jar
	    @echo "Please define absolute path to antlr4 jar in antlr4_jar variable either through environment or -e flag"
else
	    java -jar $(antlr4_jar) -visitor -package antlr src/antlr/Sentinel.g4
endif

grun:
ifndef antlr4_jar
	    @echo "Please define absolute path to antlr4 jar in antlr4_jar variable either through environment or -e flag"
else
	    java -cp $$(pwd)/comp:$(antlr4_jar) org.antlr.v4.gui.TestRig antlr.Sentinel program $(TEST_FILE) $(GRUN_OPTS)
endif

clean:
	rm -r comp/ && rm src/antlr/*.java src/antlr/*.interp src/antlr/*.tokens
