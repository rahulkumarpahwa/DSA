package Striver.BinarySearch;

public class FindFirstOccurence {
    public static int findFirstOccurrence(int arr[], int target) {
        int ans = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1; // moving to the left to get the min value of index.
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 2, 2, 2, 3, 4, 5 };
        int target = 2;
        System.out.println(findFirstOccurrence(arr, target)); // output will be 1 (0 based indexing)
    }
}
