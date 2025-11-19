// https://takeuforward.org/plus/dsa/binary-search/logic-building/search-insert-position

class Solution {
  public int searchInsert(int[] nums, int target) {
    // brute:
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        return i;
      } else if (nums[i] > target) {
        return i;
      }
    }
    return nums.length; // dummy
  }
}

class Solution {
  public int searchInsert(int[] nums, int target) {
    // optimal
    int ans = nums.length;
    int i = 0, j = nums.length - 1;
    while (i <= j) {
      int mid = i + (j - i) / 2;
      if (nums[mid] >= target) {
        ans = mid;
        j = mid - 1; // going left to get the least value.
      } else if (nums[mid] < target) {
        i = mid + 1;
      }
    }
    return ans;
  }
}
