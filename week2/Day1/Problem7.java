package Week1.Day6;

public class Problem7 {
    public static int fun(int n) {
        if (n <= 1) return n;
        return fun(n - 1) + fun(n - 3);
    }
// Usage: System.out.println(fun(5));
}
