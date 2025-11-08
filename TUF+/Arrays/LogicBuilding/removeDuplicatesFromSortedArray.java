// https://takeuforward.org/plus/dsa/arrays/logic-building/remove-duplicates-from-sorted-array

class Solution {
  public int removeDuplicates(int[] nums) {
    // brute :
    List<Integer> lt = new ArrayList<>();
    for(int num : nums){
        if(!lt.contains(num)){
            lt.add(num);
        }
    }
    for(int i = 0; i<lt.size(); i++){
        nums[i] = lt.get(i);
    }
    return lt.size();
  }
}


class Solution {
    public int removeDuplicates(int[] nums) {
        // optimal : 
        int i = 0, j = 1;
        while(j<nums.length){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }
}