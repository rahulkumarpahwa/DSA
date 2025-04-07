package Recursion;

// Printing all the binary strings without consecutive 1's.

public class BinaryStrings {
    public static void binaryStrings(int n, int lastBit, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        if (lastBit == 0) {
            binaryStrings(n - 1, lastBit, str + "1");
            binaryStrings(n - 1, lastBit, str + "0");
        } else {
            binaryStrings(n - 1, lastBit, str + "0");
        }

    }

    public static void binaryStringsNonRec(int n) {
        for (int j = 0; j < Math.pow(2, n); j++) {
            int lastBit = 0;
            String str = "";
            for (int i = 0; i < n; i++) {

                if (lastBit != 0) {
                    str += "0";
                    lastBit = 0;
                }
                if (lastBit == 0) {
                    str += "1";
                    lastBit = 1;
                }

            }
            System.out.println(str);
        }

    }

    public static void main(String[] args) {
        binaryStringsNonRec(3); // 000, 001, 010, 100, 101
    }
}
