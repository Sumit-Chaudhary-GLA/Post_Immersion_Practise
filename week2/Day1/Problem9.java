package week2.Day1;

public class Problem9 {
    public static int sumDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumDigits(n / 10);
    }
// Usage: System.out.println(sumDigits(1234));
}
