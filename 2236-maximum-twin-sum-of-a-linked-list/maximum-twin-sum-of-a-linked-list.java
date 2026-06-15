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
    public int pairSum(ListNode head)
    {
       ArrayList<Integer> list=new ArrayList<>();
       ListNode cur=head;
       while(cur!=null)
       {
        list.add(cur.val);
        // System.out.println(cur.val);
        cur=cur.next;
       }
       int n=list.size(),max=Integer.MIN_VALUE;
       for(int i=0,j=n-1;i<n && j>=0;i++,j--)
       {
        max=Math.max(max,list.get(i)+list.get(j));
       }

       return max;
    }
}