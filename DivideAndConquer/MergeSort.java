package DivideAndConquer;

public class MergeSort {

    public static void Merge(int arr[], int si, int mid, int ei) {
        int i = si;
        int j = mid + 1;
        int k = 0;
        int b[] = new int[ei - si + 1]; // ei + 1, can be put if you want.

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                b[k] = arr[i];
                i++;
            } else {
                b[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            b[k] = arr[i];
            i++;
            k++;
        }
        while (j <= ei) {
            b[k] = arr[j];
            j++;
            k++;

        }

        for (k = 0, i = si; k < b.length; i++, k++) {
            arr[i] = b[k];
        }
        // or in simplified form we can write as :
        // for (int l = si; l <= ei; l++) {
        //     arr[l] = b[l];
        // }
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        Merge(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        mergeSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
