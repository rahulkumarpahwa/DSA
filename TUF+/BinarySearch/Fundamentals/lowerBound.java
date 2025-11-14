// https://takeuforward.org/plus/dsa/binary-search/fundamentals/lower-bound-

class Solution {
    public int lowerBound(int[] nums, int x) {
       // brute:
       int ans = nums.length;
       for(int i = 0; i<nums.length; i++){
        if(nums[i] >= x){
            return i;
        }
       }
       return ans;
     }
}
