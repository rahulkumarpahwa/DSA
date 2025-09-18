// https://takeuforward.org/plus/dsa/problems/combination-sum-iii

import java.util.ArrayList;
import java.util.List;

class Solution {
    public void helper(int last, List<List<Integer>> res, List<Integer> curr, int k, int n){
        if(n == 0 && curr.size() == k){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(n < 0 || curr.size() > k) return;

        // selecting the element:
        for(int i = last; i<=9; i++){
            if(i<=n){
                curr.add(i);
                helper(i+1, res, curr, k, n-i);
                curr.remove(curr.size()-1);
            } else {
                break;
                // when the value of the i greater than n then we will break and not move further.
            }
        }
    }

        // here last means the value from where we have started the add the value in the sum till get the n.

    public List<List<Integer>> combinationSum3(int k, int n) {
        // striver solution:
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int i = 1;
        helper(i , res, curr, k, n);
        return res;
    }
}