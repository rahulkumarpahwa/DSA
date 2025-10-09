// https://takeuforward.org/plus/dsa/problems/best-time-to-buy-and-sell-stock

class Solution {
  public int stockBuySell(int[] arr, int n) {
    int max_profit = 0, min_val = arr[0], profit = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min_val) {
        min_val = arr[i];
      }
      profit = arr[i] - min_val;
      max_profit = Math.max(profit, max_profit);
    }
    return max_profit;
  }
}
