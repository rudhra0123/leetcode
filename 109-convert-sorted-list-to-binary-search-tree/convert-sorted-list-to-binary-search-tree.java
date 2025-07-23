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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head)
    {
        ListNode current=head;
        ArrayList<Integer> list=new ArrayList<>();
        if(head==null)
        return null;
        while(current!=null)
        {
            list.add(current.val);
            current=current.next;
        }
        int s=list.size();
        return getroot(list,0,s-1);
    }


    public TreeNode getroot(ArrayList<Integer> list,int low,int high)
    {
        if(low>high)
        return null;
        if(low==high)
        return new TreeNode(list.get(high));
        int mid=(low+high)/2;
        TreeNode root=new TreeNode(list.get(mid));
        TreeNode leftnode=getroot(list,low,mid-1);
        root.left=leftnode;
        TreeNode rightnode=getroot(list,mid+1,high);
        root.right=rightnode;
        return root;

    }
}