// https://takeuforward.org/plus/dsa/bit-manipulation/problems/single-number---ii

class Solution {
    public int singleNumber(int[] nums) {
        //brute:
        Arrays.sort(nums);
        if(nums[0]!=nums[1]){
          return nums[0];
        }
        if(nums[nums.length -2] != nums[nums.length -1]){
          return nums[nums.length-1];
        }
        for(int i = 1; i<nums.length -1; i++){
          if(nums[i-1] != nums[i] && nums[i] != nums[i+1]){
            return nums[i];
          }
        }
        return -1;
    }
}

class Solution {
  public int singleNumber(int[] nums) {
    // better 1:
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }

    for (int key : map.keySet()) {
      if (map.get(key) == 1) {
        return key;
      }
    }
    return -1;
  }
}
