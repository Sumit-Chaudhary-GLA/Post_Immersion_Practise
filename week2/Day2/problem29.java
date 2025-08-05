package week2.Day2;

public class problem29 {
    static int x = 1;

    public static void outer() {
        int x = 2;
        class Inner {
            void print() {
                System.out.println(x);
            }
        }
        new Inner().print();
    }

    public static void main(String[] args) {
        outer(); // Output? 2
    }
}

