package Recursion;

public class PrintIncreasingRecursion {
    public static void printIncreasingRecursion(int n) {
        if (n > 0) {
            printIncreasingRecursion(n - 1);
            System.out.print(n + " ");
        }
        return;
    }

    public static void printIncreasingRecursion2(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printIncreasingRecursion2(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        printIncreasingRecursion(6);
        System.out.println("\n======================2nd Way======================");
        printIncreasingRecursion2(6);
    }
}
