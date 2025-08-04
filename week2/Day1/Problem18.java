package Week1.Day6;

public class Problem18 {
    public static int altSum(int n) {
        if (n == 0) return 0;
        return n - altSum(n - 1);
    }
// Usage: System.out.println(altSum(5));
}
