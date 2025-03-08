public class ChangeArray {
    public static void changeArray(int arr[], int i) {
        if (i == arr.length) {
            return;
        }
        arr[i] = i + 1;
        changeArray(arr, i + 1);
        arr[i] = arr[i] - 2;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArray(arr, 0);
        for (int i : arr) {
            System.out.print( i + " ");
        }
    }
}
