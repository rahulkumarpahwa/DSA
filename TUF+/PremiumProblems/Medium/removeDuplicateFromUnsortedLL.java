// https://takeuforward.org/plus/dsa/problems/remove-duplicates-from-an-unsorted-linked-list

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Solution {
  public ListNode deleteDuplicatesUnsorted(ListNode head) {
    // my Solution:
    HashMap<Integer, Integer> map = new HashMap<>();
    ListNode p = head;
    while (p != null) {
      map.put(p.val, map.getOrDefault(p.val, 0) + 1);
      p = p.next;
    }
    ListNode temp = head;
    ListNode q = new ListNode(-1, head); // dummy Node
    ListNode prev = q;
    while (temp != null) {
      if (map.get(temp.val) > 1) {
        prev.next = temp.next;
      } else {
        prev = temp;
      }
      temp = temp.next;
    }
    return q.next;
  }
}
