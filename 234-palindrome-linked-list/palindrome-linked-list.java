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
    public boolean isPalindrome(ListNode head)
    {
        Stack<Integer> stack=new Stack();
        ListNode current=head;
        while(current!=null)
        {
            stack.push(current.val);
            current=current.next;
        }
        current=head;
        while(current!=null &&!stack.isEmpty())
        {
           if(stack.pop()!=current.val)
           return false;
           current=current.next;
        }
        return true;
        
    }
}