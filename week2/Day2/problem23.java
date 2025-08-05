package week2.Day2;

public class problem23 {
    static int x = 100;

    public static void check() {
        int x = 50;
        System.out.println(x);
    }

    public static void main(String[] args) {
        check();
        System.out.println(x); // Output? 50 100
    }
}


