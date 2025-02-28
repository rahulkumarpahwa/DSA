package Recursion;

public class SumNNatural {
    public static int sumN(int n) {
        if (n > 0) {
            return n + sumN(n - 1);
        }
        return 0;
    }

    public static int sumN2(int n) {
        if (n == 1) {
            return 1;
        }

        return n + sumN2(n - 1);
    }

    public static void main(String[] args) {
        System.out.print(sumN(6));
        System.out.println("\n======================2nd Way======================");
        System.out.print(sumN2(6));
    }
}
