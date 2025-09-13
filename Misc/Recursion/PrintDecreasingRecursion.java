package Misc.Recursion;

public class PrintDecreasingRecursion {

    public static void printDecreasingRecursion(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            printDecreasingRecursion(n - 1);

        }
    }

    public static void printDecreasingRecursion2(int n) {
        if (n == 1) {
            System.out.print(1);
            return;
        }
        System.out.print(n + " ");
        printDecreasingRecursion2(n-1);
    }

    public static void main(String[] args) {
        printDecreasingRecursion(6);
        System.out.println("\n======================2nd Way======================");
        printDecreasingRecursion2(6);
    }
}
