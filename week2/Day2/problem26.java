package week2.Day2;

public class problem26 {
    public static void demo(int x) {
        x = x + 1;
        System.out.println(x);
    }

    public static void main(String[] args) {
        int x = 5;
        demo(x);
        System.out.println(x); // Output? 6 5 
    }
}

