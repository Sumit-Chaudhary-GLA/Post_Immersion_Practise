package Week1.Day6;

public class Problem2 {
    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        return a + mystery(a, b - 1);
    }
// Usage: System.out.println(mystery(3, 4));

}
