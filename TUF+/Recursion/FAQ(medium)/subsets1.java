// https://takeuforward.org/plus/dsa/recursion/faqs-medium/subsets-i

class Solution {
  public void helper(int nums[], List<Integer> res, int i, int sum) {
    if (i >= nums.length) {
      res.add(sum);
      return;
    }
    // no select:
    helper(nums, res, i + 1, sum);
    // selected:
    helper(nums, res, i + 1, sum + nums[i]);
    return;
  }

  public List<Integer> subsetSums(int[] nums) {
    // revision 1:
    int i = 0, sum = 0;
    List<Integer> res = new ArrayList<>();
    helper(nums, res, i, sum);
    return res;
  }
}
