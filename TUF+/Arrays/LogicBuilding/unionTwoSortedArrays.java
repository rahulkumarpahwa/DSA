// https://takeuforward.org/plus/dsa/arrays/logic-building/union-of-two-sorted-arrays

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        // brute: 
        Set<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        for(int num : nums2){
            set.add(num);
        }
        int arr[] = new int[set.size()];
        int i = 0;
        for(int num : set){
            arr[i++] = num;
        }
        Arrays.sort(arr);
        return arr;
    }
}
