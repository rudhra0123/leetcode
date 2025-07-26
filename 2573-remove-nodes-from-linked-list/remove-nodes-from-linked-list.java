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
    public ListNode removeNodes(ListNode head) 
    {
        int max=Integer.MIN_VALUE;
        ListNode current=reverse(head);
        ListNode d=new ListNode(-1);
        ListNode tail=d;
        while(current!=null)
        {
            if(max<=current.val)
            {
                tail.next=current;
                tail=tail.next;
                max=current.val;
            }
           current=current.next;
        }
        tail.next=null;
        return reverse(d.next);

    }
    public ListNode reverse(ListNode head)
    {
        ListNode current=head;
        ListNode prev=null;
        while(current!=null)
        {
            ListNode temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        return prev;
    }
}