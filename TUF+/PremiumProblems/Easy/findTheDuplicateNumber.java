// https://takeuforward.org/plus/dsa/problems/find-the-duplicate-number
class Solution {
    public int findDuplicate(int[] nums) {
        // my Solution:
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i<nums.length; i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
            } else {
                return nums[i];
            }
        }
        return -1;
    }
}