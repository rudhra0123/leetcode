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
    public ListNode removeZeroSumSublists(ListNode head)
    {
        ArrayList<Integer> list=new ArrayList<>();

        int lnt=0;
        while(head!=null)
        {
            lnt++;
            list.add(head.val);
            head=head.next;
        }
        for(int i=0;i<list.size();i++)
        {
            for(int j=i;j<list.size();j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=list.get(k);
                }
                if(sum==0)
                {
                    for(int k=j;k>=i;k--)
                    {
                        list.remove(k);
                    }
                    i=-1;
                    break;
                }
            }
        }
        ListNode result=new ListNode(-1);
        ListNode current=result;
        for(int num:list)
        {
            current.next=new ListNode(num);
            current=current.next;
        }
        return result.next;
        
    }
}