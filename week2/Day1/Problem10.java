package week2.Day1;

public class Problem10 {
    public static void reversePrint(int n) {
        if (n == 0) return;
        System.out.println(n);
        reversePrint(n - 1);
    }
// Usage: reversePrint(3);
}
