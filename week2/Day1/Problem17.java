package Week1.Day6;

public class Problem17 {
    public static void countDown(int n) {
        if (n == 0) return;
        System.out.println(n);
        countDown(n - 1);
    }
// Usage: countDown(3);
}
