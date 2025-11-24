// https://takeuforward.org/plus/dsa/binary-search/logic-building/first-and-last-occurrence

class Solution {
    public int[] searchRange(int[] nums, int target) {
     // brute:
     int start = -1, end = -1; 
      for(int i = 0; i<nums.length; i++){
        if(nums[i] == target && start == -1){
            start = i;

        }
        if(nums[i] == target){
            end = i;
        }
      }
      return new int[] {start, end};
    }
}