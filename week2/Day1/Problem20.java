package week2.Day1;

public class Problem20 {
    public static int doubleFactorial(int n) {
        if (n <= 0) return 1;
        return n * doubleFactorial(n - 2);
    }
// Usage: System.out.println(doubleFactorial(5));
}
