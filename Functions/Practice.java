package Functions;

import java.lang.Math;

public class Practice {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Square of the no. is " + getSquare(i));
        }
        System.out.println();

        System.out.println("Square root of no. from 1 to 10 ");
        for (int i = 4; i <= 10; i += 2) {
            System.out.println(Math.sqrt(i));
        }

        int one = 10, two = 20;
        System.out.println("one :" + one + " two :" + two);
        swap(one, two);
        System.out.println("one :" + one + " two :" + two);

    }

    public static int getSquare(int x) {
        return x * x;

    }

    public static void swap(int one, int two) {
        int temp = one;
        one = two;
        two = temp;
    }
}
