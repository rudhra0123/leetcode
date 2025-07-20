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
    public ListNode removeElements(ListNode head, int val)
    {
       if(head==null)
       return null;
       if(head.val==val && head.next==null)
       return null;
       if(head.val==val && head!=null)
       head=head.next;
       ListNode current=head;
       while(current!=null && current.next!=null)
       {
          if(current.next.val==val)
          {
            current.next=current.next.next;
          }
          else
          current=current.next;
       }
       return (head.val==val)?head.next:head;
    }
}