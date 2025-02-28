package Recursion;

public class CheckSorted {
    public static boolean isSorted(int arr[], int n) {

        if (n == 1) {
            return true;
        }

        return arr[n - 1] >= arr[n - 2] && isSorted(arr, n - 2); // here n-1 is the last element as it is zero based
                                                                 // indexing.

    }

    public static boolean isSorted2(int arr[], int i) {
        // extra condition for checking if the array is empty or not
        if (arr.length == 1 || arr.length == 0) {
            return true;
        }

        // base condition
        if (i == arr.length - 1) {
            return true;
        }

        // recursive call
        return arr[i] <= arr[i + 1] && isSorted2(arr, i + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 4 }; // false
        System.out.println(isSorted(arr, arr.length));

        int arr2[] = { 1, 2, 4, 7, 9 }; // true
        System.out.println(isSorted(arr2, arr2.length));

        System.out.println("==================2nd way====================");

        System.out.println(isSorted2(arr2, 0)); // i is the start of the array.

    }
}
