// https://takeuforward.org/plus/dsa/problems/reverse-every-word-in-a-string

// brute solution: 
class Solution {
    public String reverseWords(String s) {
        String str[] = s.trim().split("\\s+"); // removing the multiple spaces at once.
        StringBuilder sb = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            sb.append(str[i]).append(" ");
        }
        return sb.toString().trim();
    }
}

// character by character: 
class Solution {
  public String reverseWords(String s) {
    // by character by character:
    List<String> res = new ArrayList<>();
    int i = 0;
    int start, end;
    int n = s.length();
    while (i < n) {
      if (i > n) break;
      while (i < n && s.charAt(i) == ' ') i++;
      start = i;
      while (i < n && s.charAt(i) != ' ') i++;
      end = i - 1;
      String eachWord = s.substring(start, end + 1);
      res.add(eachWord);
    }
    StringBuilder sb = new StringBuilder();
    for (int j = res.size() - 1; j >= 0; j--) {
      sb.append(res.get(j)).append(" ");
    }
    return sb.toString().trim();
  }
}


// optimal solution: 
class Solution {
  public void reverse(StringBuilder sb, int i, int j) {
    while (i <= j) {
      char ch = sb.charAt(i);
      sb.setCharAt(i, sb.charAt(j));
      sb.setCharAt(j, ch);
      i++;
      j--;
    }
  }

  public String reverseWords(String s) {
    // optimal solution:
    StringBuilder sb = new StringBuilder(s);

    // reverse the string :
    reverse(sb, 0, sb.length() - 1);
    // find the single word and shift left and then add space and then reverse:
    int i = 0, j = 0, n = sb.length();
    int start, end;
    // here j is the main cursor
    while (j < n) {
      while (j < n && sb.charAt(j) == ' ') j++;
      if (j == n) break;
      start = i;
      // shift left:
      while (j < n && sb.charAt(j) != ' ') {
        sb.setCharAt(i, sb.charAt(j));
        i++;
        j++;
      }
      end = i - 1;
      reverse(sb, start, end);

      if (i < sb.length()) {
        sb.setCharAt(i++, ' ');
      }
    }

    if (i > 0 && sb.charAt(i - 1) == ' ') i--;

    return sb.substring(0, i); // always note we will send till the i
  }
}
