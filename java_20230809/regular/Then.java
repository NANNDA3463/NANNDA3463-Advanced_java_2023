package regular;

public final class Then extends BinaryOperationBase implements Expression {

    public Then(Expression left, Expression right) {
        super(left, right);

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
