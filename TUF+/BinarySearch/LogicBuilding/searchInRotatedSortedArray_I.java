// https://takeuforward.org/plus/dsa/binary-search/logic-building/search-in-rotated-sorted-array-i

class Solution {
    public int search(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                return i;
            }
        }
        return -1;
    }
}
