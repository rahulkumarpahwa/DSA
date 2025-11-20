// https://takeuforward.org/plus/dsa/binary-search/logic-building/floor-and-ceil-in-sorted-array

class Solution {
  public int[] getFloorAndCeil(int[] nums, int x) {
    // brute:
    int floor = -1, ceil = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] >= x) {
        ceil = nums[i];
        break;
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] <= x) {
        floor = nums[i];
      }
    }
    return new int[] {floor, ceil};
  }
}
