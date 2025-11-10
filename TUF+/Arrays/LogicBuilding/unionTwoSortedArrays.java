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

class Solution {
  public int[] unionArray(int[] nums1, int[] nums2) {
    // optimal:
    List<Integer> res = new ArrayList<>();

    int i = 0, j = nums1.length - 1, k = 0, l = nums2.length - 1;
    while (i <= j && k <= l) {
      if (nums1[i] == nums2[k]) {
        if (!res.contains(nums1[i])) {
          res.add(nums1[i]);
        }
        i++;
        k++;
      } else if (nums1[i] < nums2[k]) {
        if (!res.contains(nums1[i])) {
          res.add(nums1[i]);
        }
        i++;
      } else {
        if (!res.contains(nums2[k])) {
          res.add(nums2[k]);
        }
        k++;
      }
    }
    while (i <= j) {
      if (!res.contains(nums1[i])) {
        res.add(nums1[i]);
      }
      i++;
    }
    while (k <= l) {
      if (!res.contains(nums2[k])) {
        res.add(nums2[k]);
      }
      k++;
    }
    int arr[] = new int[res.size()];
    int t = 0;
    for (int num : res) {
      arr[t++] = num;
    }
    return arr;
  }
}
