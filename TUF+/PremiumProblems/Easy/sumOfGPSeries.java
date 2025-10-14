// https://takeuforward.org/plus/dsa/problems/sum-of-gp-series

class Solution {
  public double sumOfGP(double a, double r, int n) {
    // my Solution:
    List<Double> list = new ArrayList<>();
    double square = 1;
    for (int i = 0; i < n; i++) {
      list.add(a * square);
    //   System.out.println(a * square);
      square *= r;
    }
    double sum = 0;
    for (int i = 0; i < list.size(); i++) {
      sum += list.get(i);
    }
    return sum;
  }
}
