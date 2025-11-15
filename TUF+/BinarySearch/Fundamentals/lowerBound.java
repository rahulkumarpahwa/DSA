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

class Solution {
  public int lowerBound(int[] nums, int x) {
    // optimal:
    int i = 0, j = nums.length - 1;
    int ans = nums.length;
    while (i <= j) {
      int mid = i + (j - i) / 2;
      if (nums[mid] >= x) {
        ans = mid;
        j = mid - 1; // going left.
      } else {
        i = mid + 1;
      }
    }
    return ans;
  }
}
