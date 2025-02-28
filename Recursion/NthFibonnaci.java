package Recursion;

public class NthFibonnaci {
    public static int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        // we take the 0 as the 0th element of the fibonacci series.
        int n = 6; // 6th fibonacci element.
        // 0 1 1 2 3 5 8
        System.out.println(fibonacci(n)); // 8
    }
}
