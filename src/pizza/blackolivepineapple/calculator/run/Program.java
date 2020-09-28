package pizza.blackolivepineapple.calculator.run;

import antlr.MathLexer;
import antlr.MathParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import pizza.blackolivepineapple.calculator.visitor.BuildAstVisitor;
import pizza.blackolivepineapple.calculator.visitor.EvaluateExpressionVisitor;

import java.io.Console;
import java.io.IOException;
import java.io.StringReader;

public class Program {
    public static void main(String args[])
    {
        Console console = System.console();
        if (console == null)
            return;
        while (true)
        {
            System.out.print("> ");
            try {
                String exprText = console.readLine();
                if (exprText == null || exprText.isEmpty() || exprText.trim().isEmpty()) {
                    System.out.println("Empty string detected. Exiting REPL");
                    break;
                }

                var inputStream = new ANTLRInputStream(new StringReader(exprText));
                var lexer = new MathLexer(inputStream);
                var tokenStream = new CommonTokenStream(lexer);
                var parser = new MathParser(tokenStream);

                try {
                    var cst = parser.compileUnit();
                    var ast = new BuildAstVisitor().visitCompileUnit(cst);
                    var value = new EvaluateExpressionVisitor().visit(ast);

                    System.out.printf("= %f\n", value);
                }
                catch (Exception ex) {
                    System.out.println("Unhandled exception during calculation");
                    ex.printStackTrace();
                }

                System.out.println();
            }
            catch (IOException e){
                System.err.println("Got IOException reading input or creating input stream");
                break;
            }
        }
    }
}