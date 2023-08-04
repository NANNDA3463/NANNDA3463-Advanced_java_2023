package practice;

public class Environment {
    public static void main(String[] args) {
        int x = 4; // {(x, 4)}
        int y = 5; // {(x, 4), (y, 5)} -> r로 치환
        y = y + x; // {y + x}r
        // r' = {(x, 4), (y, 9)}
        {
            int z = 3; // {(z,3)} + r'
            int y = 4; // r'' = {(z, 3), (y, 4)} + r' y가 새로 생성됨.
            y = x; // {(z, 3), (y, 4)} + r'에서 x는 상위 r'에 담겨있으므로 r'에서 가져옴
            // {(z, 3), (y, 4)} + r'
            // {}{(z, 3), (y, 4)} + r'
        }
    }
}
