package Misc.Recursion.PracticeQuestions;

public class AllOccurrences {
    public static void allOccurrences(int arr[], int i, int key) {
        if (i == arr.length) {
            return;
        }

        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        allOccurrences(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        allOccurrences(arr, 0, key); // i is the starting index

    }
}
