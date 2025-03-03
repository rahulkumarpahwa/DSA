public class QuickSort {

    public static int partition(int arr[], int si, int ei) {
        // new approach

        int i = -1; // set to the before the start of the index.
        int pivot = arr[ei];

        for (int j = si; j < ei; j++) { // run till the second last element ie. before the pivot
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // final swap
        i++; // first increase the i to set the pivot.
        int temp = arr[ei]; // pivot
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int partitionIndex = partition(arr, si, ei);
        quickSort(arr, si, partitionIndex - 1);
        quickSort(arr, partitionIndex + 1, ei);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 3, 4 };
        quickSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}