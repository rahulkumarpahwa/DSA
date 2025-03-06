package ArraysQues;

public class SearchInRotatedAndSortedArray {

    public static int searchInRotatedAndSortedArray(int arr[], int target) {
        // non-recursive

        int si = 0;
        int ei = arr.length - 1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[si] <= arr[mid]) {// Line L1

                if (arr[si] <= target && target <= arr[mid]) {
                    // left
                    ei = mid - 1;
                } else { // right
                    si = mid + 1;
                }

            } else { // Line L2

                if (arr[mid] <= target && target <= arr[ei]) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(searchInRotatedAndSortedArray(arr, target));

    }
}
