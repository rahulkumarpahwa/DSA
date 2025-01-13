package Arrays_I;

public class max_min_array {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        printArray(arr);
        maxArray(arr);
        minArray(arr);
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void maxArray(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max value is " + max);
    }

    public static void minArray(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Min value is " + min);
    }
}
