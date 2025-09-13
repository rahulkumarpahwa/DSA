package Misc.BitManipulation;

public class ClearRangeOfBits {
    public static int clearRangeOfBits(int num, int i, int j) {
        int BitMask = (~0) << (j + 1); // j is the index and << takes the position up to which we have to clear
        int a = num & BitMask;
        int b = (1 << i) - 1; // or we can write as  b = ~((~0) << i);
        return num & (a | b);
    }

    public static void main(String[] args) {
        System.out.println(clearRangeOfBits(10, 1, 5)); // num; i(start); j(end);
    }
}
