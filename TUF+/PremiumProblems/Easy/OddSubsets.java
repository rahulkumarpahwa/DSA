// https://takeuforward.org/plus/dsa/problems/odd-subsets

class Solution {
  public void helper(List<List<Integer>> res, List<Integer> curr, int nums[], int i, int sum) {
    if (i >= nums.length) {
      if (sum % 2 != 0) {
        res.add(new ArrayList<>(curr));
      }
      return;
    }

    // not selected:
    helper(res, curr, nums, i + 1, sum);

    // selected:
    curr.add(nums[i]);
    helper(res, curr, nums, i + 1, sum + nums[i]);
    curr.remove(curr.size() - 1);
    return;
  }

  public List<List<Integer>> setsWithOddSum(int[] nums) {
    // my Solution : recursion

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();
    int i = 0;
    int sum = 0;
    helper(res, curr, nums, i, sum);
    return res;
  }
}
