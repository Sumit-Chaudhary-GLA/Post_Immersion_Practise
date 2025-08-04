package Week1.Day6;

public class Problem15 {
    public static void f(double x) {
        if (x < 1) return;
        f(x / 2);
        System.out.println((int)x);
    }
// Usage: f(8);
}
