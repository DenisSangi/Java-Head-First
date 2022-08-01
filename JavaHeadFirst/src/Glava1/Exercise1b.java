package Glava1;

public class Exercise1b {
    public static void main(String[] args) {
        int x = 5;

        while (x > 0) {
            x = x - 1;
            System.out.println("x = " + x);

            if (x < 3 && x > 0) {
                System.out.println("little x");
            }
        }
    }
}
