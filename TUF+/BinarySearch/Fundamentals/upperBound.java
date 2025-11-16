// https://takeuforward.org/plus/dsa/binary-search/fundamentals/upper-bound
class Solution {
  public int upperBound(int[] nums, int x) {
    // brute:
    for(int i = 0; i<nums.length; i++){
        if(nums[i] > x){
            return i;
        }   
    }
    return nums.length;
  }
}
