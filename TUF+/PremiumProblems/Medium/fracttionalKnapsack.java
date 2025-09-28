// https://takeuforward.org/plus/dsa/problems/fractional-knapsack

class Item {
  int val;
  int wt;
  double frac;

  Item(int val, int wt) {
    this.val = val;
    this.wt = wt;
    frac = (double) this.val / this.wt;
  }
}

class Solution {

  public double fractionalKnapsack(int[] val, int[] wt, long cap) {
    // solution:
    if (cap == 0) return 0.0;

    Item items[] = new Item[val.length];
    for (int i = 0; i < val.length; i++) {
      items[i] = new Item(val[i], wt[i]);
    }

    Arrays.sort(items, (a, b) -> Double.compare(b.frac, a.frac));

    double sum = 0;
    for (Item item : items) {
      if (item.wt <= cap) {
        sum += item.val;
        cap -= item.wt;
      } else {
        sum += (((double) cap / item.wt) * item.val);
        cap = 0;
      }
    }
    return sum;
  }
}
