//  https://takeuforward.org/plus/dsa/arrays/logic-building/move-zeros-to-end

class Solution {
    public void moveZeroes(int[] nums) {
        // brute:
        int k = 0;
        int arr[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                arr[k++] = nums[i];
            }
        }
        while(k < nums.length){
            arr[k++] = 0;
        }
        for(int i = 0; i<nums.length; i++){
            nums[i] = arr[i];
        }
    }
}


class Solution {
  public void moveZeroes(int[] nums) {
    // optimal :
    int j = 0, i = 0;
    while (j < nums.length) {
      if (nums[j] != 0) {
        nums[i] = nums[j];
        i++;
      }
      j++;
    }
    while (i < nums.length) {
      nums[i] = 0;
      i++;
    }
  }
}
