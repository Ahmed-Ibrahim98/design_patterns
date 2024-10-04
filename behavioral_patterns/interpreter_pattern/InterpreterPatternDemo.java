package behavioral_patterns.interpreter_pattern;

public class InterpreterPatternDemo {
    public static void main(String[] args){
        Context context = new Context();
        // ... Set context values if needed

        Expression expression = new AddExpression(
                new MultiplyExpression(new NumberExpression(2),new NumberExpression(3)),
                new SubtractExpression(new NumberExpression(5), new NumberExpression(1))
        );

        int result = expression.interpret(context);
        System.out.println(result); // Result is: 10
    }
}
