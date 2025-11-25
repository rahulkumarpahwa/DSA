// https://takeuforward.org/plus/dsa/binary-search/logic-building/single-element-in-sorted-array

class Solution {
  public int singleNonDuplicate(int[] nums) {
    // brute:
    if (nums.length == 1) return nums[0];
    if (nums[0] != nums[1]) return nums[0];
    if (nums[nums.length - 1] != nums[nums.length - 2]) return nums[nums.length - 1];
    for (int i = 1; i < nums.length - 1; i++) {
      if ((nums[i] != nums[i - 1]) && (nums[i] != nums[i + 1])) {
        return nums[i];
      }
    }
    return -1; // dummy
  }
}
