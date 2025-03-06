
public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) { // outer loop running from start to second last.
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) { // inner loop running from i+1 to end, as before the i all the
                                                       // elements will be sorted.
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }

            }

            // swapping, the value:
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 3, -1 };
        selectionSort(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
