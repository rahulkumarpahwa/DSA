public class ChangeArray {
    public static void changeArray(int arr[], int i) {
        if (i == arr.length) {
            printArray(arr);
            return;
        }
        arr[i] = i + 1;
        changeArray(arr, i + 1);
        arr[i] = arr[i] - 2;
    }

    public static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArray(arr, 0);
        printArray(arr);
    }
}
