package Arrays_I;

public class rotateArray {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int k = 3;

        printArray(arr);
        RotateArray(arr, k);
        printArray(arr);

    }

    public static void RotateArray(int[] a, int k) {
        k = k % a.length;
        if (k < 0) {
            k = k + a.length;
        }
        int size = a.length - 1;
        for (int i = 0; i < k; i++) {
            int temp = a[size];
            for (int j = size; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = temp;
        }

    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}