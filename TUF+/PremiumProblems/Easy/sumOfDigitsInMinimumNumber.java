// https://takeuforward.org/plus/dsa/problems/sum-of-digits-in-the-minimum-number

class Solution {
  public int sumOfDigits(int[] nums) {
    // my solution:
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length; i++) {
      min = Math.min(min, nums[i]);
    }
    int sum = 0;
    while (min > 0) {
      int ld = min % 10;
      sum += ld;
      min /= 10;
    }
    return sum % 2 == 0 ? 1 : 0;
  }
}
