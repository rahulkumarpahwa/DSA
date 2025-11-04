// https://takeuforward.org/plus/dsa/arrays/fundamentals/left-rotate-array-by-one

class Solution {
    public void rotateArrayByOne(int[] nums) {
        int start = nums[0];
        int i = 0;
        for(i = 1; i<nums.length; i++){
            nums[i-1] = nums[i];
        }
        nums[i-1] = start;
    }
}