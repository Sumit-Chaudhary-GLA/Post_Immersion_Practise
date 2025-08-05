package week2.Day2;

public class problem25 {
    public static int modify(int x) {
        x = x * 2;
        return x;
    }

    public static void main(String[] args) {
        int x = 4;
        x = modify(x);
        System.out.println(x); // Output? 8
    }
}

