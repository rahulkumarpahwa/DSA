public class BubbleSortoptimised {

    public static void bubbleSortoptimised(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] >= arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 3, -1 };
        bubbleSortoptimised(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
