package week2.Day1;

public class Problem1 {
    public static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n - 1);
    }
// Usage: System.out.println(sum(5));
}
