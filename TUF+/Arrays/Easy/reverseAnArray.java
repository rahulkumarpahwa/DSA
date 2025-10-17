// https://takeuforward.org/plus/dsa/beginner-problem/basic-arrays/reverse-an-array

class Solution {
  public void reverse(int[] arr, int n) {
    int i = 0;
    int j = n - 1;
    while (i <= j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }
}
