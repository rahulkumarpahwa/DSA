package Recursion;

public class XRaisedToNOptimized {
    public static int xPowerN(int base, int power) {

        // base condition
        if( power == 0){ // as we keep on dividing the power in half then it become zero in end.
            return 1;
        }

        int halfSquare = xPowerN(base, power / 2) * xPowerN(base, power/2);

        if (power % 2 != 0) { // odd power
            halfSquare *= base;
        }
        return halfSquare;
    }

    public static void main(String[] args) {
        System.out.println(xPowerN(2, 10)); // base ; power
    }
}
