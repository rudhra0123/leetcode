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
    public ListNode partition(ListNode head, int x)
    {
      ArrayList<Integer> list1=new ArrayList<>();
      ArrayList<Integer> list2=new ArrayList<>();
      ListNode curr=head;
      if(head==null)
      return null;
      if(head.next==null)
      return head;
      while(curr!=null)
      {
        if(curr.val<x)
        list1.add(curr.val);
        else
        list2.add(curr.val);
        curr=curr.next;
      } 
     ListNode newnode;

    if(list1.size() > 0)
    newnode = new ListNode(list1.get(0));
    else
    newnode = new ListNode(list2.get(0));
     
      ListNode cur=newnode; 
      for(int i=1;i<list1.size();i++)
      {
      cur.next=new ListNode(list1.get(i));
      cur=cur.next;
      }
      for(int i=(list1.size()==0 ? 1 : 0); i<list2.size(); i++)
      {
      cur.next=new ListNode(list2.get(i));
      cur=cur.next;
      }
      return newnode;
    }
}