package Misc.Recursion;

public class XRaisedToN {

    public static int xPowerN(int base, int power) {
        if (power == 0) {
            return 1;
        }

        return base * xPowerN(base, power - 1);

    }

    public static void main(String[] args) {
        System.out.println(xPowerN(2, 10)); // base; power
    }
}
