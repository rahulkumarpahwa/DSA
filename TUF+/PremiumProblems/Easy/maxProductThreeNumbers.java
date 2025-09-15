// https://takeuforward.org/plus/dsa/problems/maximum-product-of-three-numbers

class Solution {
  public int maximumProduct(int[] nums) {
    // my solution:
    Arrays.sort(nums);
    int n = nums.length;
    int last_three_max_num = nums[n - 1] * nums[n - 2] * nums[n - 3];
    int max_number = nums[n - 1];
    int two_least_min_numbers = nums[0] * nums[1];
    return Math.max(last_three_max_num, (two_least_min_numbers * max_number));
  }
}
