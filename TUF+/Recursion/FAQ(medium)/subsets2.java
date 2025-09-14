// https://takeuforward.org/plus/dsa/problems/subsets-ii

class Solution {
  public void helper(int nums[], int i, Set<List<Integer>> set, List<Integer> curr) {
    if (i >= nums.length) {
      List<Integer> list = new ArrayList<>(curr);
      Collections.sort(list);
      set.add(list);
      return;
    }

    // select :
    curr.add(nums[i]);
    helper(nums, i + 1, set, curr);
    curr.remove(curr.size() - 1);

    // unselect:
    helper(nums, i + 1, set, curr);
    return;
  }

  public List<List<Integer>> subsetsWithDup(int[] nums) {
    // my Solution : brute
    Set<List<Integer>> set = new HashSet<>();
    List<Integer> curr = new ArrayList<>();
    int i = 0;
    helper(nums, i, set, curr);
    return new ArrayList<>(set);
  }
}
