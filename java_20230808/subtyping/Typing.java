package subtyping;


interface Flyable {

}


abstract class 동물 {
    private boolean flyable;

    public String type() {
        return this.getClass().getSimpleName();
    }

    public boolean 날수있니() {
        return false;
    }

    public boolean isFlyable() {
        return this.flyable;
    }

    public void setFlyable(boolean flyable) {
        this.flyable = flyable;
    }
}



abstract class 새 extends 동물 {

}


class 닭 {

}


class 박쥐 extends 동물 {
    @Override
    public boolean 날수있니() {
        return true;
    }
}


class 벌 extends 동물 implements 동물, Flyable {
    @Override
    public boolean 날수있니() {
        return true;
    }
}


class 참새 implements 새, Flyable {

}


class 펭귄 implements 새 {

}


final class 비행기 implements Flyable {
}


public class Typing {


    public static void main(String[] args) {

        Flyable[] 날것들 = {new 박쥐(), new 참새(), new 벌(), new 비행기()};


        for (Flyable 날것 : 날것들) {
            Typing.날수있니(날것);
        }

    }

    public static void 날수있니(Flyable x) {
        System.out.println(x + "은(는) 날 수 있어.");
    }

    public static void 날수있니(동물 x) {
        System.out.println(x.type() + (x.날수있니() ? "는(은) 헤엄 칠 수 있어." : "는(은) 못 헤엄쳐."));
    }
}

