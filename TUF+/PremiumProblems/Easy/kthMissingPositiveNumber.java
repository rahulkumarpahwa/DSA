// https://takeuforward.org/plus/dsa/problems/kth-missing-positive-number

class Solution {
    public static boolean checkArr(int arr[], int curr){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == curr) return true;
        }
        return false;
    }

  public static int findKthPositive(int[] arr, int k) {
    // my Solution:
    int curr = 1;
    int missing = 0;
    while (k>0) {
        if(!checkArr(arr, curr)){
            k--;
            missing = curr;
        }
        curr++;
    }
    return missing;
  }
}
