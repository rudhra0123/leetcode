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
    public int[] nodesBetweenCriticalPoints(ListNode head)
    {
      ListNode temp=head;
      int[] ans=new int[2];
      Arrays.fill(ans,-1);
      ArrayList<Integer> list=new ArrayList<>();
      int ind=1;
      while(temp.next.next!=null)
      {
        ind++;
        int a=temp.val;
        int b=temp.next.val;
        int c=temp.next.next.val; 
        if(a>b && b<c)
        list.add(ind);
        if(a<b && b>c)
        list.add(ind);
        temp=temp.next;
      } 
      if(list.size()<2)
      return ans;
      int min=Integer.MAX_VALUE;
      for(int i=1;i<list.size();i++)
      {
        min=Math.min(min,(list.get(i)-list.get(i-1)));
      } 
      int max=list.get(list.size()-1)-list.get(0);
      ans[0]=min;
      ans[1]=max;
      return ans;
    }
}