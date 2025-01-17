package Assignment;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 5, 0, -1, 5 };
        // print array
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        mergerSort(a, 0, a.length - 1);
        // print array
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void mergerSort(int[] a, int low, int high) {
        int mid;
        if (low < high) {
            mid = (low + high) / 2;
            mergerSort(a, low, mid);
            mergerSort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;

        int[] b = new int[high + 1];

        while (i <= mid && j <= high) {
            if (a[i] > a[j]) {
                b[k] = a[j];
                k++;
                j++;
            } else {
                b[k] = a[i];
                k++;
                i++;
            }
        }

        while (i <= mid) {
            b[k] = a[i];
            k++;
            i++;
        }
        while (j <= high) {
            b[k] = a[j];
            k++;
            j++;
        }

        for (int l = low; l <= high; l++) {
            a[l] = b[l];
        }

    }
}