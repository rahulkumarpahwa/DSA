package Assignment;

public class BinarySearch {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        int val = 6;
        int low = 0;
        int high = a.length - 1;
        boolean result = BinarySearchArray(a, val, low, high);
        if (result) {
            System.out.println("The " + val + " is found.");
        } else {
            System.out.println("The " + val + " can't be found.");
        }

    }

    public static boolean BinarySearchArray(int[] a, int val, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == val) {
                return true;
            } else if (a[mid] > val) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}