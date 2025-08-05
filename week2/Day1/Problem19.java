package week2.Day1;

public class Problem19 {
    public static int fun(int n) {
        if (n == 1) return 1;
        return n * fun(n - 1) + fun(n - 1);
    }
// Usage: System.out.println(fun(3));
}
