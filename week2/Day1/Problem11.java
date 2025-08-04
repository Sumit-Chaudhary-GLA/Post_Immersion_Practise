package Week1.Day6;

public class Problem11 {
    public static int foo(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return foo(n - 1) + foo(n - 2);
    }
// Usage: System.out.println(foo(4));
}
