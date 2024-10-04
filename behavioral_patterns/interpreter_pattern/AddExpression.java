package behavioral_patterns.interpreter_pattern;

public class AddExpression implements Expression{
    private Expression leftOperand;
    private Expression rightOperand;

    public AddExpression(Expression leftOperand, Expression rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret(Context context) {
        return leftOperand.interpret(context) + rightOperand.interpret(context);
    }
}
