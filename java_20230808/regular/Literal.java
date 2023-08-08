package regular;

public final class Literal implements Expression {

    private char character;

    public Literal(char c) {
        this.character = c;
    }

    public char getCharacter() {
        return this.character;
    }

    @Override
    public String toString() {
        return String.valueOf(getCharacter());
    }

}
