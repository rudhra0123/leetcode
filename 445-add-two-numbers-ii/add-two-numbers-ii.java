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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode list1=reverseList(l1);
        ListNode list2=reverseList(l2);
        ListNode current1=list1;
        ListNode current2=list2;
        ListNode result=new ListNode(-1);
        ListNode tail=result;
        int carry=0;
        if(current1==null && current2==null)
        return null;
        while(current1!=null||current2!=null||carry>0)
        {
            int a=(current1!=null)?current1.val:0;
            int b=(current2!=null)?current2.val:0;
            System.out.println(a+""+b);
            int sum=a+b+carry;
            int val=sum%10;
            carry=sum/10;
            System.out.println(sum+""+carry+""+val);
            tail.next=new ListNode(val);
            if(current1!=null) current1=current1.next;
            if(current2!=null) current2=current2.next;
            tail=tail.next;
            
        }

        return reverseList(result.next);
    }
    public ListNode reverseList(ListNode head)
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