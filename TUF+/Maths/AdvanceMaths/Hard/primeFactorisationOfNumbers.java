// https://takeuforward.org/plus/dsa/maths/sieve-of-eratosthenes/prime-factorisation-of-a-number

class Solution {
  public void findfactors(int value, List<Integer> curr) {
    int counter = 2;
    while (value > 1) {
      if (value % counter == 0) {
        curr.add(counter);
        value /= counter;
      } else {
        counter++;
      }
    }
    if (curr.isEmpty()) {
      curr.add(value);
    }
  }

  public List<List<Integer>> primeFactors(int[] queries) {
    // brute solution:
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();
    for (int i = 0; i < queries.length; i++) {
      curr.removeAll(curr);
      findfactors(queries[i], curr);
      res.add(new ArrayList<>(curr));
    }
    return res;
  }
}
