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
    static int min1,min2;
    static boolean a;
    public int findSecondMinimumValue(TreeNode root)
    {
       min1=Integer.MAX_VALUE;
       min2=Integer.MAX_VALUE;
       a=false;
       fun(root); 
       if(!a)
       return -1;
       return min2;   
    }
    public void fun(TreeNode root)
    {
        if(root==null)
        return;
        if(min1>root.val )
        {
            min1=root.val;
        }
        if(min2>=root.val && root.val>min1)
        {
        min2=root.val;
        a=true;
        }
        fun(root.left);
        fun(root.right);
    }
}