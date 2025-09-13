package Misc.Recursion;

public class LastOccurrenceInArray {
    public static int lastOccurrence(int arr[], int start, int key) {
        if (start == arr.length) {
            return -1;
        }
        int isFound = lastOccurrence(arr, start + 1, key);
        if (isFound == -1 && arr[start] == key) {
            return start;
        }
        
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 5, 4, 6, 4, 7 };
        int key = 4;
        System.out.println(lastOccurrence(arr, 0, key));
        // lastOccurrence(arr, 0, key); // array, starting index and key to be found.

    }
}
