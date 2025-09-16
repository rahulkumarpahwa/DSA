// https://takeuforward.org/plus/dsa/problems/combination-sum-ii

class Solution {
  public void helper(int i, List<List<Integer>> res, List<Integer> curr, int nums[], int target) {
    if (target == 0) {
      res.add(new ArrayList(curr));
      return;
    }
    if (i >= nums.length || target < 0) return;

    // when selected:
    curr.add(nums[i]);
    helper(i + 1, res, curr, nums, target - nums[i]);
    curr.remove(curr.size() - 1);

    // when not selected: then we have not to take the same element again otherwise solution will
    // repeat.
    for (int j = i + 1; j < nums.length; j++) {
      if (nums[j] != nums[i]) {
        helper(j, res, curr, nums, target);
        break; // once founded the one with not same then we will break.
      }
    }
    return;
  }

  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    // striver solution:
    Arrays.sort(candidates);
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();
    helper(0, res, curr, candidates, target);
    return res;
  }
}
