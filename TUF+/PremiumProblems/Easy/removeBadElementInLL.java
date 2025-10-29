// https://takeuforward.org/plus/dsa/problems/remove-bad-elements-in-linked-list

/*Definition for Singly Linked List
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
*/

class Solution {
    public ListNode removeBadElements(ListNode head, int val) {
        // brute force:
        ListNode p = head;
        List<Integer> res = new ArrayList<>();

        while (p != null) {
            if (p.val != val) {
                res.add(p.val);
            }
            p = p.next;
        }

        if (res.size() == 0)
            return null;
        ListNode newHead = new ListNode(res.get(0));
        ListNode temp = newHead;
        for (int i = 1; i < res.size(); i++) {
            ListNode newNode = new ListNode(res.get(i));
            temp.next = newNode;
            temp = newNode;
        }
        return newHead;
    }
}


/*Definition for Singly Linked List
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
*/


class Solution {
    public ListNode removeBadElements(ListNode head, int val) {
        // brute Solution 2nd : 
        ListNode p = new ListNode(-1);
        p.next = head; // important
        ListNode start = p;
        ListNode temp = head;
        while(temp!= null){
            if(temp.val == val){
                start.next = temp.next;
            } else {
                start = temp;
            }
            temp = temp.next;
        }
        return p.next;
    }
}

//optimal solution:
/*Definition for Singly Linked List
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
*/


class Solution {
    public ListNode removeBadElements(ListNode head, int val) {
        ListNode prev = head;
        ListNode temp = prev;
        ListNode curr = head;
        while(curr!=null){
            if(curr.val == val){
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        if(temp.val == val) return temp.next; // when the head value is also the bad number.
        return temp;
    }
}