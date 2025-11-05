// https://takeuforward.org/plus/dsa/arrays/fundamentals/left-rotate-array 

class Solution {
  public void rotateArray(int[] nums, int k) {
    // brute Solution:
    k = k % nums.length;
    int temp[] = new int[k];
    for (int i = 0; i < k; i++) {
      temp[i] = nums[i];
    }
    for (int i = k; i < nums.length; i++) {
      nums[i - k] = nums[i];
    }

    int start = nums.length - k;
    int z = 0;
    for (int i = start; i < nums.length; i++) {
      nums[i] = temp[z];
      z++;
    }
  }
}

class Solution {
  public void reverse(int i, int j, int arr[]) {
    while (i <= j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }

  public void rotateArray(int[] nums, int k) {
    // optimal :
    // 1. reverse till k
    // 2. reverse the rest
    // 3. reverse the whole
    k = k % nums.length;
    reverse(0, k - 1, nums);
    reverse(k, nums.length - 1, nums);
    reverse(0, nums.length - 1, nums);
  }
}


