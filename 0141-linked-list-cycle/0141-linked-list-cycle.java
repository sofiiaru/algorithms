/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        //BRUTE FORCE solution
        // List<ListNode> visited = new ArrayList<>(); 

        // ListNode cur = head;
        // while(cur.next != null){
        //     if(visited.contains(cur)) return true;
        //     else visited.add(cur);
        //     cur = cur.next;
        // }
        // return false;

        //TWO POINTERS solution
        ListNode slow, fast;
        slow = fast = head;
        while(fast != null && fast.next != null){
             slow = slow.next;
             fast = fast.next.next;
             if(slow == fast) return true;
         }
         return false;
    }
}