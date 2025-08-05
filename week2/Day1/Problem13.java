package week2.Day1;

public class Problem13 {
    public static void fun(int n) {
        if (n == 0) return;
        fun(n - 1);
        fun(n - 1);
        System.out.println(n);
    }
// Usage: fun(2);
}
