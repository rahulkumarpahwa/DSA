package Sorting;

public class SelectionSort {

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[minValueIndex] > arr[j]) {
                    minValueIndex = j;
                }
            }
            int temp = arr[minValueIndex];
            arr[minValueIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 2, 5, 8, 7 };
        selectionSort(arr);
        PrintArray(arr);

    }
}
