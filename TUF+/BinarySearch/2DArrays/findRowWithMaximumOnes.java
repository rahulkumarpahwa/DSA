// https://takeuforward.org/plus/dsa/binary-search/2d-arrays/find-row-with-maximum-1's

class Solution {
  public int rowWithMax1s(int[][] mat) {
    // brute force:
    int maxCount = 0;
    int ans = -1;
    for (int i = 0; i < mat.length; i++) {
      int count = 0;
      for (int j = 0; j < mat[0].length; j++) {
        if (mat[i][j] == 1) {
          count++;
        }
      }
      if (count > maxCount) {
        maxCount = count;
        ans = i;
      }
    }
    return ans;
  }
}