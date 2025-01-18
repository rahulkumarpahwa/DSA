package Leetcode;

public class sort0and1s {

    public static void main(String[] args) {
        // there are three approaches to solve this problem.
        // 1. using any sorting algo. ( obsolete way.)
        // 2. using counters
        // 3. two pointer approach.

        int[] a = { 1, 0, 1, 0, 0, 1, 0 };
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        sortedArrayCounters(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        sortedArrayPointers(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void sortedArrayCounters(int[] a) {
        int countZeroes = 0;
        int countOnes = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                countZeroes++;
            } else {
                countOnes++;
            }
        }

        int i = 0; // zero counter
        int j = 0; // one counter
        int k = 0; // array counter
        while (i < countZeroes) {
            a[k] = 0;
            i++;
            k++;
        }
        while (j < countOnes) {
            a[k] = 1;
            j++;
            k++;
        }

    }

    public static void sortedArrayPointers(int[] a) {
        int left = 0;
        int right = a.length - 1;
        int temp;
        while (left < right) {
            if (a[left] == 0) {
                left++;
            } else {
                temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                right--;
            }
        }

    }
}