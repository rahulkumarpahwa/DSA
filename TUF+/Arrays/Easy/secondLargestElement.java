// https://takeuforward.org/plus/dsa/arrays/fundamentals/second-largest-element

class Solution {
    public int secondLargestElement(int[] nums) {
        // brute : sort and second last
        if(nums.length < 2) return -1;
        Arrays.sort(nums); 
        int largest = nums[nums.length -1];
        for(int i = nums.length -2; i>=0; i--){
            if(nums[i] != largest){
                return nums[i];
            }
        }
        return -1;
    }
}

class Solution {
    public int secondLargestElement(int[] nums) {
        // better : two traversal
        if(nums.length < 2) return -1;
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            largest = Math.max(largest, nums[i]);
        }

        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > secondLargest && nums[i] != largest){
                secondLargest = nums[i];
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
}

class Solution {
    public int secondLargestElement(int[] nums) {
      // optimal : single traversal
      int largest = Integer.MIN_VALUE;
      int secondLargest = Integer.MIN_VALUE;
      for(int i = 0; i<nums.length; i++){
        if(nums[i] > largest){
            secondLargest = largest;
            largest = nums[i];
        } else if(nums[i] > secondLargest && nums[i] != largest){
            secondLargest = nums[i];
        }
      }
      return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
}