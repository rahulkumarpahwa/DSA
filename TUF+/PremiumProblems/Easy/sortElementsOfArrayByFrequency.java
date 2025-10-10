// https://takeuforward.org/plus/dsa/problems/sort-elements-of-an-array-by-frequency

class Solution {
  public List<Integer> sortByFrequency(int[] arr) {
    // my solution:
    List<Integer> res = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int val : arr) {
      map.put(val, map.getOrDefault(val, 0) + 1);
    }

    List<Integer> nums = new ArrayList(map.keySet());
    Collections.sort(
        nums,
        (a, b) -> {
          int freq1 = map.get(a);
          int freq2 = map.get(b);
          if (freq1 != freq2) {
            return freq2 - freq1;
          } else {
            return a - b;
          }
        });

    for (int num : nums) {
      for (int i = 0; i < map.get(num); i++) {
        res.add(num);
      }
    }
    return res;
  }
}
