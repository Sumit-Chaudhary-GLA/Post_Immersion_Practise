package Week1.Day6;

public class Problem16 {
    public static int power(int x, int y) {
        if (y == 0) return 1;
        return x * power(x, y - 1);
    }
// Usage: System.out.println(power(2, 4));
}
