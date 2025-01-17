package Leetcode;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] a = { 1, 1, 2, 2, 3, 4, 5, 5, 6, 6 };
        for (int val : a) {
            System.out.print(val + " ");
        }
        System.out.println();

        int k = removeDuplicateArray(a);
        for (int val : a) {
            System.out.print(val + " ");
        }
        System.out.println();
        System.out.println("The value of k is " + k);

    }

    public static int removeDuplicateArray(int[] a) {
        int iIdx = 1; // iIdx stands for the insert Index.

        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] != a[i]) {
                a[iIdx] = a[i];
                iIdx++;
            }

        }
        return iIdx;
    }
}