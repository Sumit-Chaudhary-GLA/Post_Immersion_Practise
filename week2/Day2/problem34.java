package week2.Day2;

public class problem34 {
    public static int recUpdate(int a) {
        if (a > 10)
            return a;
        return recUpdate(a + 2);
    }

    public static void main(String[] args) {
        System.out.println(recUpdate(4)); // Output? 12
    }
}

