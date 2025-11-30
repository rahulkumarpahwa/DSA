// https://takeuforward.org/plus/dsa/bit-manipulation/problems/single-number---i

class Solution {
    public int singleNumber(int[] nums) {
        // brute:
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}

class Solution {
  public int singleNumber(int[] nums) {
    // optimal:
    int ans = 0;
    for (int i = 0; i < nums.length; i++) {
      ans ^= nums[i];
    }
    return ans;
  }
}
