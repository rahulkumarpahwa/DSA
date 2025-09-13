package Misc.BitManipulation;

public class FastExponential {
    public static int fastExponential(int base, int exponent) {
        int ans = 1;
        while (exponent > 0) { // until the exponent completes becomes zero ie. not a single bit is zero. if their is a bit between which is zero then still there will be 1 after that zero which makes it not zero and still solves further.
            if ((exponent & 1) != 0) {
                ans = base * ans;
            }
            base = base * base;
            exponent = exponent >> 1; // right shift by 1
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExponential(3, 5)); // 3 raised to power of 5 = 243 
    }
}
