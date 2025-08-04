package Week1.Day6;

public class Problem5 {
    public static int fact(int n) {
        if (n == 0) return 1;
        return n * fact(n - 1);
    }
// Usage: System.out.println(fact(4));
}
