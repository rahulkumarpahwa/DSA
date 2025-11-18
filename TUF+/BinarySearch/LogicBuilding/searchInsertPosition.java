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
