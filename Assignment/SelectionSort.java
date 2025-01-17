package Assignment;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 5, 0, -1, 5 };
        // print array
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        selectionSort(a, a.length - 1);
        // print array
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] a, int size) {
        int temp, indexOfMin;
        for (int i = 0; i < size - 1; i++) { // no. of passes

            indexOfMin = i;
            for (int j = i + 1; j < size; j++) // comparison are also four but done till last.
            { // or write here j<size;

                if (a[j] < a[indexOfMin]) // here we are comparing values and replacing index.
                {
                    indexOfMin = j;
                }
            }

            // swapping the minimum value with first value before Horizontal line.
            temp = a[i];
            a[i] = a[indexOfMin];
            a[indexOfMin] = temp;
        }
    }
}