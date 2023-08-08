package subtyping;

abstract class 동물 {
    public String type() {
        return this.getClass().getSimpleName();
    }

    public void 날수있니() {
        System.out.println(this.type() + "은(는) 날 수 없어");

    }
}


class 새 extends 동물 {
    @Override
    public void 날수있니() {
        System.out.println(this.type() + "은(는) 날 수 있어");

    }
}


class 닭 {

}


class 박쥐 extends 동물 {
    @Override
    public void 날수있니() {
        System.out.println("박쥐는 난다요");
    }
}


class 벌 extends 동물 {
    @Override
    public void 날수있니() {
        System.out.println("벌은 난다요");
    }
}


class 참새 extends 새 {
    @Override
    public void 날수있니() {
        System.out.println("참새는 난다요");
    }
}


class 펭귄 extends 새 {

}


public class Typing {
    public static void main(String[] args) {

        동물[] 동물들 = {new 박쥐(), new 참새(), new 벌(), new 펭귄()};


        for (동물 한마리 : 동물들) {
            한마리.날수있니();
        }

    }
}

