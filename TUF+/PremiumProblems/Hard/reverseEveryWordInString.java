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
