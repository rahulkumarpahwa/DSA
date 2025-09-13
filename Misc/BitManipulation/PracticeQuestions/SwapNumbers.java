package Misc.BitManipulation.PracticeQuestions;

// swap with out third variable

public class SwapNumbers {
    public static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swap Numbers " + a + " " + b);
    }

    public static void main(String[] args) {
        int a = 2, b = 4;
        System.out.println("Before Swap Numbers " + a + " " + b);
        swap(a, b);

    }
}
