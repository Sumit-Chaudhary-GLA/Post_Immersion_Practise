package week2.Day1;

public class Problem14 {
    public static int productOfDigits(int n) {
        if (n == 0) return 1;
        return (n % 10) * productOfDigits(n / 10);
    }
// Usage: System.out.println(productOfDigits(123));
}
