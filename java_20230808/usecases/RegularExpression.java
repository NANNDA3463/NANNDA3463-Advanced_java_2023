package usecases;

import java.util.function.BinaryOperator;
import regular.*;

public class RegularExpression {
    public static void main(String[] args) {
        /*
         * Literal a = new Literal('a'); Literal b = new Literal('b');
         * 
         * 
         * Expression a_ab = a.or(a.then(b)); Expression ba_a0n =
         * b.then(a).or(Expression.EPSILON.or(a.star()));
         * 
         * System.out.println(a_ab); System.out.println(ba_a0n);
         */

        Literal a = new Literal('a');
        Literal b = new Literal('b');

        Expression a_ab = a.or(a.then(b));
        Expression ba_a0n = b.then(a).or(Expression.EPSILON.or(a.star()));

        System.out.println(a_ab);
        System.out.println(Literals.of(a_ab));
        System.out.println(ba_a0n);
        System.out.println(Literals.of(ba_a0n));

    }
}
