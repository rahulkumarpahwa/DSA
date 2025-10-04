// https://takeuforward.org/plus/dsa/problems/largest-unique-number

class Solution {
  public int largestUniqueNumber(int[] nums) {
    // my Solution:

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }

    int max = Integer.MIN_VALUE;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() == 1) {
        max = Math.max(entry.getKey(), max);
      }
    }

    return max == Integer.MIN_VALUE ? -1 : max;
  }
}
