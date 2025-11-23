// https://takeuforward.org/plus/dsa/binary-search/logic-building/search-in-rotated-sorted-array-i

class Solution {
    public int search(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                return i;
            }
        }
        return -1;
    }
}

class Solution {
  public int search(int[] nums, int k) {
    // optimal:
    int i = 0, j = nums.length - 1;
    while (i <= j) {
      int mid = i + (j - i) / 2;
      if (nums[mid] == k) return mid;

      if (nums[i] <= nums[mid]) {
        if (nums[i] <= k && k <= nums[mid]) {
          j = mid - 1;
        } else {
          i = mid + 1;
        }
      } else {
        if (nums[mid] <= k && k <= nums[j]) {
          i = mid + 1;
        } else {
          j = mid - 1;
        }
      }
    }
    return -1;
  }
}
