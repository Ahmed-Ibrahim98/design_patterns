package behavioral_patterns.interpreter_pattern;

public class DivideExpression implements Expression{
    private Expression leftOperand;
    private Expression rightOperand;

    public DivideExpression(Expression leftOperand, Expression rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret(Context context) {
        return leftOperand.interpret(context) / rightOperand.interpret(context);
    }
}
