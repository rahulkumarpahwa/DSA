package Assignment;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = { 1, 5, 6, 7, 6, 8, 2, 4 };

        // print array
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        QuickSortArray(a, 0, (a.length - 1));

        // print array
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void QuickSortArray(int[] a, int low, int high) {
        if (low < high) {
            int partitionIndex = Partition(a, low, high);
            QuickSortArray(a, low, partitionIndex - 1);
            QuickSortArray(a, partitionIndex + 1, high);
        }
    }

    public static int Partition(int[] a, int low, int high) {
        int i = low + 1;
        int j = high;
        int pivot = a[low];
        int temp;

        do {
            while (a[i] <= pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }

            if (i < j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        } while (i < j);

        temp = a[low];
        a[low] = a[j];
        a[j] = temp;
        return j;
    }
}
