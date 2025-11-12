// https://takeuforward.org/plus/dsa/arrays/logic-building/intersection-of-two-sorted-arrays

class Solution {
  public int[] intersectionArray(int[] nums1, int[] nums2) {
    // optimal:
    List<Integer> res = new ArrayList<>();
    int i = 0, j = 0;
    while (i <= nums1.length - 1 && j <= nums2.length - 1) {
      if (nums1[i] == nums2[j]) {
        res.add(nums1[i]);
        i++;
        j++;
      } else if (nums1[i] < nums2[j]) {
        i++;
      } else {
        j++;
      }
    }

    int arr[] = new int[res.size()];
    for (int k = 0; k < res.size(); k++) {
      arr[k] = res.get(k);
    }
    return arr;
  }
}


