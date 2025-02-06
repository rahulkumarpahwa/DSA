package Sorting;

public class CountingSort {
    public static void countingSort(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int count[] = new int[max + 1]; // extra 1 to include the zero in the count.

        // setting up count:
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sorting:
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 2, 5, 8, 7, 4 };
        countingSort(arr);
        PrintArray(arr);

    }
}
