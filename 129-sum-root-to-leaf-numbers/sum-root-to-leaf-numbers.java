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
    public int total=0;
    public int sumNumbers(TreeNode root)
    {
      help(root,0); 
      return total; 
    }
    public void help(TreeNode root,int sum)
    {
        if(root==null)
        return;
        sum=root.val+sum*10;
        if(root.left==null && root.right==null)
        {
        total+=sum;
        return;
        }
        help(root.left,sum);
        help(root.right,sum);
        

    }
}