package regular;

import java.util.function.BinaryOperator;

public final class Or extends BinaryOperationBase implements Expression {
    // private BinaryOperationBase delegated;

    public Or(Expression left, Expression right) {
        super(left, right);
        // delegated = new BinaryOperationBase(left, "|", right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
