package test;

class 실험 {
    public static void main(String[] args) {
        Top leftTop = new Left();
        Top rightTop = new Right();
        leftTop.accept(new 걸어());
        leftTop.accept(new 뛰어());
        rightTop.accept(new 걸어());
        rightTop.accept(new 뛰어());
    }
}
