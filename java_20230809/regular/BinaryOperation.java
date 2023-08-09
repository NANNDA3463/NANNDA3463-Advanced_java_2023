package regular;

abstract class BinaryOperationBase {
    private Expression left;
    private Expression right;
    // private String operator;

    protected BinaryOperationBase(Expression left, Expression right) {
        this.left = left;
        this.right = right;
        // this.operator = operator;

    }

    public Expression getLeft() {
        return this.left;
    }

    public Expression getRight() {
        return this.right;
    }


}

