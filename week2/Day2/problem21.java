package week2.Day2;

public class problem21 {
    public static int modify(int x) {
        x = x + 10;
        return x;
    }

    public static void main(String[] args) {
        int a = 5;
        modify(a);
        System.out.println(a); // Output? 5
    }
}
