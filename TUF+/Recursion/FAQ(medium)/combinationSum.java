// https://takeuforward.org/plus/dsa/recursion/faqs-medium/combination-sum

class Solution {
  public void helper(List<List<Integer>> res, List<Integer> curr, int i, int target, int nums[]) {
    if (target == 0) {
      res.add(new ArrayList<>(curr));
      return;
    }
    if (i >= nums.length || target < 0) return;

    // selecting the value:
    if (nums[i] <= target) {
      curr.add(nums[i]);
      helper(res, curr, i, target - nums[i], nums); // not i+1 as we want the same value to repeat.
      curr.remove(curr.size() - 1);
    }

    // when not selected:
    helper(res, curr, i + 1, target, nums);

    return;
  }

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    // solution : striver
    int i = 0;
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();
    helper(res, curr, i, target, candidates);
    return res;
  }
}
