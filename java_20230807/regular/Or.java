package regular;

public final class Or implements Expression {
    private BinaryOperationBase delegated;

    public Or(Expression left, Expression right) {
        // super(left, right);
        delegated = new BinaryOperationBase(left, "|", right);
    }

    @Override
    protected String getOperator() {
        return delegated.getOperator();
    }
}
