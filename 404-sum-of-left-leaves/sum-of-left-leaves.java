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
    public int sumOfLeftLeaves(TreeNode root)
    {
      int sum=0;
      Queue<TreeNode> q=new LinkedList<>();
      ArrayList<TreeNode> list=new ArrayList<>();
      if(root==null || (root.left==null && root.right==null))
      return 0;
      else 
      q.add(root);
      while(!q.isEmpty())
      {
        int size=q.size();
        for(int i=0;i<size;i++)
        {
            TreeNode curr=q.poll();
            if(curr.left!=null)
            {
            q.add(curr.left);
            list.add(curr.left);
            }
            if(curr.right!=null)
            q.add(curr.right);
        }
         
      }
      for(int i=0;i<list.size();i++)
      {
        TreeNode curr=list.get(i);
        if(curr.left==null && curr.right==null)
        sum+=curr.val;
      }
      return sum;  
    }
}