// https://takeuforward.org/plus/dsa/problems/twin-numbers

class Solution {
  public int numberOccursTwice(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int num : nums){
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    for(int num : map.keySet()){
      if(map.get(num)  == 2){
        return num;
      }
    }
    return -1;
  }
}
