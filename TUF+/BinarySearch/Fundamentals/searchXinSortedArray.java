// https://takeuforward.org/plus/dsa/binary-search/fundamentals/search-x-in-sorted-array

class Solution {
  public int search(int[] nums, int target) {
    // iterative :
    int i = 0;
    int j = nums.length - 1;
    while (i <= j) {
      int mid = i + (j - i) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] > target) {
        j = mid - 1;
      } else {
        i = mid + 1;
      }
    }
    return -1;
  }
}

class Solution {
    public int binSearch(int nums[], int start, int end, int target){
        while(start<=end){
            int mid = start + (end - start) /2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
               return binSearch(nums, start, mid -1, target);
            } else {
                return binSearch(nums, mid + 1, end, target);
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
       // recursive :
       return binSearch(nums, 0, nums.length -1, target);
    }
}