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
        boolean a=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        a=false;
        fun(root,0,targetSum);
        return a;
    }
    public void fun(TreeNode root,int n,int target)
    {
        if(root==null)
        return;
        n+=root.val;
        if(root.left==null && root.right==null)
        {
            if(n==target)
            a=true;
            return;
        }
        fun(root.left,n,target);
        fun(root.right,n,target);
    }
}