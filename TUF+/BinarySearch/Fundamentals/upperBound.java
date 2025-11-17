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
class Solution {
    public int upperBound(int[] nums, int x) {
        // optimal:
        int ans = nums.length; 
        int i = 0, j = nums.length -1;
        while(i<=j){
            int mid = i + (j - i) /2;
            if(nums[mid] > x){
                ans = mid;
                j = mid -1;
            } else {
                i = mid + 1;
            }
        }
        return ans;
    }
}
