package practice;

public final class Fractional extends java.lang.Number {
    private int numerator;
    private int denominator;

    public Fractional(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("분모가 0이다!");
        }
        // this.rep = new int[] {numerator, denominator};
        this.numerator = numerator;
        this.denominator = denominator;
        nomalize();
        // 아래 클래스 구현 숙제
        // 유리수의 비는 항상 같아야한다는 걸 증명해야한다.
        classInvariant();
    }

    // 분모
    public int getDenominator() {
        return this.denominator;
    }

    // 분자
    public int getNumerator() {
        return this.numerator;
    }

    private void classInvariant() {
        int multiplyNum = 5;
        assert Mathx.gcd(this.numerator, this.denominator) == Mathx
                .gcd((this.numerator * multiplyNum), this.denominator * multiplyNum)
                + 1 : "Invarient를 만족합니다!";

    }

    private void nomalize() {
        int gcd = Mathx.gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }



    //
    @Override
    public String toString() {
        return "" + this.getNumerator() + "/" + this.getDenominator();
    }



    public Fractional add(Fractional r) {
        return new Fractional(
                this.getNumerator() * getDenominator() + r.getNumerator() * this.getDenominator(),
                this.getDenominator() * r.getDenominator());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.getNumerator();
        result = prime * result + this.getDenominator();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        // obj가 Fractional에게 상속되거나 확장된 값인지 비교
        if (!(obj instanceof Fractional))
            return false;
        // Fractional로 강제변환
        Fractional other = (Fractional) obj;
        // Abstract Barrier를 지켜주기 위해 미리 만들었던 equal로 비교
        return this.equals(other);
    }

    private boolean equals(Fractional that) {
        // 다른 Object가 들어올 수 있는지 비교
        if (this == that)
            return true;
        if (that == null)
            return false;
        // Abstract Barrier를 지켜주기 위해 미리 만들었던 equal로 비교

        return this.getNumerator() == that.getNumerator()
                && this.getDenominator() == that.getDenominator();
    }

    @Override
    public int intValue() {
        return (int) this.longValue();
    }

    @Override
    public long longValue() {
        return (long) this.getNumerator() / this.getDenominator();
    }

    @Override
    public float floatValue() {
        return (float) this.doubleValue();
    }

    @Override
    public double doubleValue() {
        return (double) this.getNumerator() / (double) this.getDenominator();

    }

}
