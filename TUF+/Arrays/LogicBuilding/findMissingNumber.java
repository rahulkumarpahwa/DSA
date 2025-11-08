// https://takeuforward.org/plus/dsa/arrays/logic-building/find-missing-number

class Solution {
    public int missingNumber(int[] nums) {
        // brute : 
        int largest = nums.length;
        for(int i = 0; i<=largest; i++){
            int flag = 0;
            for(int j = 0; j<nums.length; j++){
                if(nums[j] == i){
                    flag = 1;
                }
            }
            if(flag == 0){
                return i;
            }
        }
        return -1; // dummy return
    }
}

class Solution {
  public int missingNumber(int[] nums) {
    // better :
    int hash[] = new int[nums.length + 1];

    for (int i = 0; i < nums.length; i++) {
      hash[nums[i]]++;
    }
    for (int i = 0; i < hash.length; i++) {
      if (hash[i] == 0) {
        return i;
      }
    }
    return -1; // dummy
  }
}

class Solution {
  public int missingNumber(int[] nums) {
    // optimal :
    int sum = (nums.length * (nums.length + 1)) / 2;
    for (int i = 0; i < nums.length; i++) {
      sum -= nums[i];
    }
    return sum;
  }
}


class Solution {
  public int missingNumber(int[] nums) {
    // optimal -II :
    int num = 0;
    for (int i = 1; i <= nums.length; i++) {
      num ^= i;
    }

    for (int i = 0; i < nums.length; i++) {
      num ^= nums[i];
    }

    return num;
  }
}

