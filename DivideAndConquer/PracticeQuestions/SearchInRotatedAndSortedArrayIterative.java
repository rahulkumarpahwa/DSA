package PracticeQuestions;

public class SearchInRotatedAndSortedArrayIterative {

    public static int searchInRotatedAndSortedArrayIterative(int arr[], int target) {
        int si = 0;
        int ei = arr.length - 1;

        while (si <= ei) {

            int mid = si + (ei - si) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            // Line 1:
            if (arr[si] <= arr[mid]) {
                // Left :
                if (arr[si] <= target && target <= arr[mid]) {
                    ei = mid - 1;
                } else {
                    // right:
                    si = mid + 1;
                }
            }

            // Line 2:
            if (arr[mid] <= arr[ei]) {
                if (arr[mid] <= target && target <= arr[ei]) {
                    // right:

                    si = mid + 1;
                } else {
                    // left :
                    ei = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 }; // sorted and rotated array.
        int target = 0; // expected output is 4.
        System.out.println(searchInRotatedAndSortedArrayIterative(arr, target));
    }
}