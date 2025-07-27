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
    public void reorderList(ListNode head)
    {
       ListNode current=head;
       Stack<ListNode> stack=new Stack();
       int lnt=0;
       while(current!=null)
       {
          stack.push(current);
          current=current.next;
          lnt++;
       } 
       current=head;
        for(int i=0;i<lnt/2;i++)
        {
            ListNode tail=stack.pop();
            tail.next=current.next;
            current.next=tail;
            current=tail.next;
        }
        if(current!=null) current.next=null;

    }
}