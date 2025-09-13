package Misc.BitManipulation;

public class CountSetBits {

    public static int countSetBits(int n) {

        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) { // As the & operator with the 1 return the same the same LSB on the num so when
                                // it is not zero so we will then count.
                count++;
            }
            n = n >> 1; // right shift
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(10));
    }
}
