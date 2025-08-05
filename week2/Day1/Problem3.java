package week2.Day1;

public class Problem3 {
    public static int f(int n) {
        if (n == 0) return 0;
        return n + f(n - 2);
    }
// Usage: System.out.println(f(6));

}
