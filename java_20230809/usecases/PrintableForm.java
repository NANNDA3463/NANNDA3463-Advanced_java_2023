package usecases;

import regular.*;

public final class PrintableForm implements regular.Visitor {
    private StringBuffer printableFormStringBuilder = new StringBuffer();

    @Override
    public void visit(Epsilon e) {
        printableFormStringBuilder.append(String.valueOf("\u03B5"));
    }

    // 말단 클래스
    @Override
    public void visit(Literal e) {
        printableFormStringBuilder.append(e.getCharacter());
    }

    @Override
    public void visit(Then e) {
        printableFormStringBuilder.append('(');
        e.getLeft().accept(this);
        e.getRight().accept(this);
        printableFormStringBuilder.append(')');
    }

    @Override
    public void visit(Or e) {
        printableFormStringBuilder.append('(');
        e.getLeft().accept(this);
        printableFormStringBuilder.append('|');
        e.getRight().accept(this);
        printableFormStringBuilder.append(')');
    }

    @Override
    public void visit(Star e) {
        printableFormStringBuilder.append('(');
        e.getExpression().accept(this);
        printableFormStringBuilder.append(')');
        printableFormStringBuilder.append('*');
    }

    public String getLiterals() {
        return printableFormStringBuilder.toString();
    }

    public static String of(Expression e) {
        PrintableForm literal = new PrintableForm();
        e.accept(literal);
        return literal.getLiterals();
    }

}
