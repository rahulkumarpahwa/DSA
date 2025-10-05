// https://takeuforward.org/plus/dsa/problems/fixed-point

class Solution {
    public int fixedPoint(int[] arr) {
        // my solution:
        for(int i = 0; i<arr.length; i++){
            if(arr[i] - i == 0) return i;
        }
        return -1;
    }
}

class Solution {
    public int fixedPoint(int[] arr) {
        // my Solution: 
        int i = 0; int j = arr.length -1;
        int result = -1;
        while(i<=j){
            int mid = i+ (j-i) /2;
            if(arr[mid] == mid){
                result = mid;
                j = mid -1; // going the left to get the least value
            } else if(arr[mid] > mid) {
                j = mid -1;
            } else {
                i = mid +1;
            }
        }
        return result;
    }
}