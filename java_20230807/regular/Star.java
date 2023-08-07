package regular;

public final class Star implements Expression {

    private Expression expression;


    public Star(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return this.expression;
    }

    @Override
    public String toString() {
        return "(" + this.getExpression() + ")" + "*";
    }



}
