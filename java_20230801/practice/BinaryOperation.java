package practice;

// BinaryOperation은 이항연산을 하는 것이므로, 앞으로 있을 이항 연산들의 조건을 기술하기 위해, interface로 저장해둠.
// 안의 apply는 그 형태만 먼저 지정해둔 것이다.
public interface BinaryOperation {
    public double apply(double x, double y);
}
