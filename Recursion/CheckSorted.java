package Recursion;

public class CheckSorted {
    public static boolean isSorted(int arr[], int n) {

        if (n == 1) {
            return true;
        }

        return arr[n-1] >= arr[n - 2] && isSorted(arr, n - 2); // here n-1 is the last element as it is zero based indexing.

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 4 };
        System.out.println(isSorted(arr, arr.length));
    }
}
