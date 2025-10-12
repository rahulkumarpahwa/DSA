// https://takeuforward.org/plus/dsa/problems/capacity-to-ship-packages-within-d-days

class Solution {
  public boolean checkCapacity(int weights[], int capacity, int days) {
    int sum = 0;
    int count = 1; // intial day count is 1.
    for (int i = 0; i < weights.length; i++) {
      if (sum + weights[i] <= capacity) {
        sum += weights[i];
      } else {
        count++;
        sum = weights[i];
      }
    }
    return count <= days;
  }

  public int shipWithinDays(int[] weights, int days) {
    // my Solution:
    int min = Integer.MIN_VALUE;
    int max = 0;

    for (int num : weights) {
      min = Math.max(min, num);
      max += num;
    }

    int capacity = 0;
    while (min <= max) {
      int mid = min + (max - min) / 2;
      if (checkCapacity(weights, mid, days)) {
        capacity = mid;
        max = mid - 1; // going left to get the least value
      } else {
        min = mid + 1;
      }
    }
    return capacity;
  }
}
