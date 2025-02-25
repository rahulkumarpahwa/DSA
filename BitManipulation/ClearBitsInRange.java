package BitManipulation;

public class ClearBitsInRange {
    public static int ClearBitsInR(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = ~((~0) << i); // other way is b = ( 1<<i) -1;
        int BitMask = a | b;
        return n & BitMask;
    }

    public static void main(String[] args) {
        System.out.println(ClearBitsInR(10, 2, 4)); // n = 10, i =2, j=4
    }
}
