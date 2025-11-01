// https://takeuforward.org/plus/dsa/arrays/fundamentals/largest-element
class Solution {
    public int largestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }
        return largest;
    }
}