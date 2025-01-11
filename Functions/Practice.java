package Functions;

import java.lang.Math;

public class Practice {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Square of the no. is " + getSquare(i));
        }
        System.out.println();

        System.out.println("Square root of no. from 1 to 10 ");
        for (int i = 1; i <= 5; i++) {
            System.out.println(Math.sqrt(i));
        }
    }

    public static int getSquare(int x) {
        return x * x;

    }
}
