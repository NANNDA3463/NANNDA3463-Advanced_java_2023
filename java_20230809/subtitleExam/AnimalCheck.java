package subtitleExam;

public class AnimalCheck {
    public static void main(String[] args) {
        Typing.날수있니(new 박쥐());
        // Typing.날수있니(new 펭귄());
        Typing.날수있니(new 참새());

        // Typing.헤엄칠수있니(new 박쥐());
        // Typing.헤엄칠수있니(new 펭귄());
        // Typing.헤엄칠수있니(new 참새());
        동물 A = new 박쥐();
        동물 B = new 펭귄();
        동물 C = new 참새();

        Typing.타입분류(A);
        Typing.타입분류(B);
        Typing.타입분류(C);

    }
}
