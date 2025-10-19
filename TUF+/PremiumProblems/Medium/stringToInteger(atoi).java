// https://takeuforward.org/plus/dsa/problems/string-to-integer-atoi

class Solution {
  public int myAtoi(String input) {
    // my Solution:
    long num = 0;
    int sign = 1;
    int i = 0;
    int n = input.length();
    while (i < n && input.charAt(i) == ' ') {
      i++;
    }

    if (i < n && input.charAt(i) == '-') {
      sign = -1;
      i++;
    } else if (i < n && input.charAt(i) == '+') {
      i++;
    }

    while (i < n && Character.isDigit(input.charAt(i))) {
      num *= 10;
      num += input.charAt(i) - '0';
      i++;
      if (num * sign >= Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      } else if (num * sign <= Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }
    }
    // System.out.println(num);
    return (int) num * sign;
  }
}
