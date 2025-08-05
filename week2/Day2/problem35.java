package week2.Day2;

public class problem35 {
    public static void f(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        int x = 3, y = 5;
        f(x, y);
        System.out.println(x + " " + y); // Output? (5,3)  (3,5)
    }
}

