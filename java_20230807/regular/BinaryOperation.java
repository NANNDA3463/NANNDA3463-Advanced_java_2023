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

    /*
     * private String getOperator() { return this.operator; }
     */

    @Override
    public String toString() {
        return "(" + this.getLeft() + this.getOperator() + this.getRight() + ")";
    }

    protected abstract String getOperator();

}

