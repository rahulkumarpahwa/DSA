package PracticeQuestions;

public class MergeSortString {

    public static void mergeString(String arr[], int si, int ei, int mid) {
        int i = si;
        int j = mid + 1;
        int k = si;
        String temp[] = new String[ei + 1];

        while (i <= mid && j <= ei) {
            if (arr[i].charAt(0) > arr[j].charAt(0)) {
                temp[k] = arr[j];
                j++;
            } else {
                temp[k] = arr[i];
                i++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }
        while (j <= ei) {
            temp[k] = arr[j];
            k++;
            j++;
        }

        for (int l = si; l <= ei; l++) {
            arr[l] = temp[l];
        }
    }

    public static void mergeSortString(String arr[], int si, int ei) {
        if (si >= ei) { /*
                         * MAKE SURE TO PUT THE = SIGN HERE...........Reason:
                         * Single Element Subarray: When si == ei, the subarray has only one element. A
                         * single element is already sorted, so no further action is needed.
                         * Empty Subarray: When si > ei, the subarray is empty, which can happen in
                         * certain edge cases. An empty subarray is trivially sorted.
                         */
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSortString(arr, si, mid);
        mergeSortString(arr, mid + 1, ei);
        mergeString(arr, si, ei, mid);
    }

    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        // Sample Output I : arr = { 'tearth", "mars", "mercury", "sun"}
        mergeSortString(arr, 0, arr.length - 1);
        for (String str : arr) {
            System.out.print(str + " ");
        }
    }
}
