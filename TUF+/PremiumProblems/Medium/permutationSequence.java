// https://takeuforward.org/plus/dsa/problems/permutation-sequence
// brute solution : (TLE)

class Solution {
  public String construct(int nums[]) {
    String result = "";
    for (int num : nums) {
      result += num;
    }
    return result;
  }

  public void swap(int i, int j, int nums[]) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  public void helper(int nums[], List<String> res, int i) {
    if (i == nums.length - 1) {
      res.add(construct(nums));
      return;
    }
    for (int j = i; j < nums.length; j++) {
      swap(i, j, nums);
      helper(nums, res, i + 1);
      swap(i, j, nums);
    }
  }

  public String getPermutation(int n, int k) {
    // my solution :brute force:
    int nums[] = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = i + 1;
    }
    List<String> res = new ArrayList<>();
    int i = 0; // starting index
    helper(nums, res, i);
    Collections.sort(res); // sorting is important.
    return res.get(k - 1); // k is position
  }
}

// Optimal Solution : 

class Solution {
  public String getPermutation(int n, int k) {
    // optimal Solution:
    if (k == 1 && n == 1) return "1";

    // storing the factorial upto (0 to 9) (you can calculate as well)
    int preDefinedFactorial[] = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
    String res = "";
    ArrayList<Integer> curr = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      curr.add(i + 1);
    }
    k = k - 1; // zero based indexing

    for (int i = 0; i < n; i++) {
      int blockSize = preDefinedFactorial[n - i - 1]; // size of each block
      int index = k / blockSize;
      res += curr.get(index);
      curr.remove(index);
      k = k % blockSize;
    }

    return res;
  }
}
