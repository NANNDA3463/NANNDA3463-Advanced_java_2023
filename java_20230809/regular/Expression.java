package regular;

public interface Expression {
    // EPSILON은 상수이기 때문에, new로 만들어서 여러 개를 만들 필요가 없음. 때문에 Expression이 생성될 때 하나 만들어지도록 함.

    // Singleton 패턴
    public static final Epsilon EPSILON = Epsilon.value;


    public default Expression then(Expression e) {
        return new Then(this, e);
    }

    public default Expression or(Expression e) {
        return new Or(this, e);
    }

    public default Expression star() {
        return new Star(this);
    }

    public void accept(Visitor visitor);


}
