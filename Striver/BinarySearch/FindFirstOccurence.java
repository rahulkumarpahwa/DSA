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
            } else if(arr[mid] < target) { // when the value at mid is small then target then go to the right to get the value atleast.
                low = mid + 1;
            } else { // going to left when arr[mid] > target then the we have to go to left to first get the value atleast.
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 2, 2, 2, 3, 4, 5 };
        int target =  0;
        System.out.println(findFirstOccurrence(arr, target)); // output will be 1 (0 based indexing)
    }
}
