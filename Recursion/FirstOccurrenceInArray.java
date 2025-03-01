package Recursion;

public class FirstOccurrenceInArray {

    public static int firstOccurrence(int arr[], int start, int key) {
        // base condition
        if (start == arr.length) {
            return -1;// -1 means key not found.
        }

        // returning condition
        if (arr[start] == key) {
            return start;
        }

        // recursive call
        return firstOccurrence(arr, start + 1, key);

    }

    public static int firstOccurrence2(int arr[], int end, int key) {
        if (end == 0) {
            return -1;
        }

        if (arr[end] == key) {
            return end;
        }
        return firstOccurrence2(arr, end - 1, key);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(firstOccurrence(arr, 0, 5));// array ; starting index; and key to be found.


        int arr2[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(firstOccurrence2(arr2, arr.length-1, 5));// array ; ending index; and key to be found.
    }
}
