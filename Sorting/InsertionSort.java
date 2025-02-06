package Sorting;

public class InsertionSort {

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) { // starting from 1 because 1st element is sorted in itself.
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // not the arr[i] because the value of the arr[j] has been pushed to the arr[i].

        }
    }

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 2, 5, 8, 7 };
        insertionSort(arr);
        PrintArray(arr);

    }
}
