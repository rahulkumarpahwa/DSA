// https://takeuforward.org/plus/dsa/problems/alt-and-tab-simulation

class Solution {
  public int[] simulationResult(int[] windows, int[] queries) {
    // my solution:
    ArrayList<Integer> res = new ArrayList<>();
    for (int i = windows.length - 1; i >= 0; i--) {
      res.add(windows[i]);
    }

    for (int i = 0; i < queries.length; i++) {
      int currVal = queries[i];
      res.remove(Integer.valueOf(currVal));
      res.add(currVal);
    }

    for (int i = 0; i < windows.length; i++) {
      windows[i] = res.get(windows.length - 1 - i);
    }

    return windows;
  }
}
