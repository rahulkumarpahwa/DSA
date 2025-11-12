// https://takeuforward.org/plus/dsa/binary-search/fundamentals/search-x-in-sorted-array

class Solution {
  public int search(int[] nums, int target) {
    // iterative :
    int i = 0;
    int j = nums.length - 1;
    while (i <= j) {
      int mid = i + (j - i) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] > target) {
        j = mid - 1;
      } else {
        i = mid + 1;
      }
    }
    return -1;
  }
}
