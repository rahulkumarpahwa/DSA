
public class SearchInRotatedAndSortedArray {

    public static int searchInRotatedAndSortedArray(int arr[], int si, int ei, int target) {

        if (si > ei) { // don't put the = in the comparsion, beacuse we need to comapare the class of overlap as well.
            return -1; // -1 means not found.
        }

        // find mid:
        int mid = si + (ei - si) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        // first Line L1: when arr[si] <= arr [mid]
        if (arr[si] <= arr[mid]) {
            // case a: // left of L1
            if (arr[si] <= target && target <= arr[mid]) {
                return searchInRotatedAndSortedArray(arr, si, mid - 1, target);
            } else {
                // case b : right of L1
                return searchInRotatedAndSortedArray(arr, mid + 1, ei, target);
            }
        } else { // second Line L2: when arr[mid] <= arr[ei]
            // case c : right of L2
            if (arr[mid] <= target && target <= arr[ei]) {
                return searchInRotatedAndSortedArray(arr, mid + 1, ei, target);
            } else {
                return searchInRotatedAndSortedArray(arr, si, mid - 1, target);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 }; // sorted and rotated array.
        int target = 0; // expected output is 4.
        System.out.println(searchInRotatedAndSortedArray(arr, 0, arr.length - 1, target));
    }
}
