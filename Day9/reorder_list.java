 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        } 
         
        ListNode t2 = reverse( slow.next , null); 
        ListNode t1   = head;
        slow.next = null;
        while (t1 != null && t2 != null) {
            ListNode tmp1 = t1.next;
            ListNode tmp2 = t2.next;

            t1.next = t2; 
            t2.next = tmp1;

            t1 = tmp1;
            t2 = tmp2;
        }
    }
    public ListNode reverse( ListNode curr , ListNode prev){
        if(curr==null){
            return prev;
        }
        ListNode temp = reverse( curr.next , curr);
        curr.next = prev;
        return temp;
    }
}