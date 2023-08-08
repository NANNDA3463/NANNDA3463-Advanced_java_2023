package regular;

public class Literals implements regular.Visitor {
    private StringBuilder literals = new StringBuilder("");

    @Override
    public String of(Visitor a_ab) {

        return literals.toString();
    }


    // ...
}
