package week2.Day2;

public class problem24 {
    
    static int a = 10;

    public static void test() {
        a = a + 5;
    }

    public static void main(String[] args) {
        test();
        System.out.println(a); // Output? 15
    }
}

