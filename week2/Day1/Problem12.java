package week2.Day1;

public class Problem12 {
    public static int series(int n) {
        if (n == 1) return 1;
        return n * series(n - 1);
    }
// Usage: System.out.println(series(5));
}
