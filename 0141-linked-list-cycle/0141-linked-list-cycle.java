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
        //brute force solution

        List<ListNode> visited = new ArrayList<>(); 

        ListNode cur = head;
        while(cur.next != null){
            if(visited.contains(cur)) return true;
            else visited.add(cur);
            cur = cur.next;
        }
        return false;
    }
}