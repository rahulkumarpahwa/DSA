// https://takeuforward.org/plus/dsa/problems/minimum-repetations

class Solution {
  public int minimumRepetitions(String a, String b) {
    // brute Solution:
    StringBuilder sb = new StringBuilder();
    int count = 0;

    while (sb.length() < b.length()) {
      sb.append(a);
      count++;
    }

    if (sb.toString().contains(b)) {
      return count;
    }

    // edge cases : if the string b has different order than a:
    sb.append(a);
    count++;

    if (sb.toString().contains(b)) {
      return count;
    }

    return -1;
  }
}
