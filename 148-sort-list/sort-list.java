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
    public ListNode sortList(ListNode head)
    {
     

        if(head==null||head.next==null)
        return head;
        ListNode middle=midvalue(head);
        ListNode temp=middle.next;
        middle.next=null;
        System.out.println(middle.val);
        ListNode left=sortList(head);
        ListNode right=sortList(temp);
        return MergeList(left,right);
    }
    public ListNode midvalue(ListNode mid)
    {
        ListNode slow=mid;
        ListNode fast=mid.next;
       while(fast!=null && fast.next!=null)
       {
        slow=slow.next;
        fast=fast.next.next;
       } 
       return slow;
    }
    public ListNode MergeList(ListNode left,ListNode right)
    {
        ListNode result=new ListNode(-1);
        ListNode current=result;
        while(left!=null && right!=null)
        {
            if(left.val<right.val)
            {
                current.next=left;
                left=left.next;
            }
            else
            {
                current.next=right;
                right=right.next;
            }
            current=current.next;
        }
        if(left!=null)
        current.next=left;
        else
        current.next=right;
        return result.next;
    }
}