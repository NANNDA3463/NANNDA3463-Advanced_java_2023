package regular;

public final class Or extends BinaryOperationBase implements Expression {

    public Or(Expression left, Expression right) {
        super(left, "|", right);
    }

}
