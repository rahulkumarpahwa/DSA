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


class Solution {
  public int[] getFloorAndCeil(int[] nums, int x) {
    // optimal :
    int floor = -1, ceil = -1;
    int i = 0, j = nums.length - 1;
    while (i <= j) {
      int mid = i + (j - i) / 2;
      if (nums[mid] >= x) {
        ceil = nums[mid];
        j = mid - 1;
      } else {
        i = mid + 1;
      }
    }

    i = 0;
    j = nums.length - 1;
    while (i <= j) {
      int mid = i + (j - i) / 2;
      if (nums[mid] <= x) {
        floor = nums[mid];
        i = mid + 1;
      } else {
        j = mid - 1;
      }
    }
    return new int[] {floor, ceil};
  }
}
