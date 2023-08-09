package usecases;

import regular.*;


public final class Literals implements regular.Visitor {
    private StringBuilder literals = new StringBuilder();


    @Override
    public void visit(Epsilon e) {}

    @Override
    public void visit(Literal e) {
        literals.append(e.getCharacter());
    }

    @Override
    public void visit(Then e) {
        e.getLeft().accept(this);
        e.getRight().accept(this);
    }

    @Override
    public void visit(Or e) {
        e.getLeft().accept(this);
        e.getRight().accept(this);
    }

    @Override
    public void visit(Star e) {
        e.getExpression().accept(this);
    }

    public String getLiterals() {
        return literals.toString();
    }

    public static String of(Expression e) {
        Literals literals = new Literals();
        e.accept(literals);
        return literals.getLiterals();
    }

}
