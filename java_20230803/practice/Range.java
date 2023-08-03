package practice;

public final class Range {
    private int lowerBound;
    private int upperBound;


    public Range(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        classInvariant();

    }

    private void classInvariant() {
        if (this.getLowerBound() > this.getUpperBound()) {
            throw new IllegalArgumentException(String.format("Range Exception %d > %d",
                    this.getLowerBound(), this.getUpperBound()));
        }
    }

    public int getUpperBound() {
        return this.upperBound;
    }

    public int getLowerBound() {
        return this.lowerBound;
    }
}
