package Arrays_I;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        printArray(arr);
        reverseArray(arr);
        printArray(arr);

    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] a) {
        int start = 0;
        int length = a.length - 1;
        while (start <= length) {
            int temp = a[start];
            a[start] = a[length];
            a[length] = temp;
            length--;
            start++;
        }
    }
}
