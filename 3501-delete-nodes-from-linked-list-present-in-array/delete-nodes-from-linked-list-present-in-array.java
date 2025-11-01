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
    public ListNode modifiedList(int[] nums, ListNode head)
    {
      HashSet<Integer> setu=new HashSet<>();
        ListNode current=head;
        ListNode result=new ListNode(0);
        ListNode result2=result;
        for(int i:nums)
        {
            setu.add(i);
        }
     while(current!=null)
        {
            if(!setu.contains(current.val))
            {
                 result2.next=current;
                result2=result2.next;
            }
                current=current.next;
        } 
        result2.next = null;
    return result.next;  
    }
}