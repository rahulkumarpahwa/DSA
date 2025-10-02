// https://takeuforward.org/plus/dsa/problems/counting-elements

class Solution {
    public int countElements(int[] arr) {
        // optimal: 
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            hs.add(arr[i]);
        }
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(hs.contains(arr[i] + 1)){
                count++;
            }
        }
        return count;
    }
}


class Solution {
  public boolean checkArr(int val, int num[]) {
    for (int i = 0; i < num.length; i++) {
      if (num[i] == val) {
        return true;
      }
    }
    return false;
  }

  public int countElements(int[] arr) {
    // my solution:
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (checkArr(arr[i] + 1, arr)) {
        count++;
      }
    }
    return count;
  }
}
