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
    static int c;
    public int averageOfSubtree(TreeNode root)
    {
        c=0;
        fun(root);
        return c;

    }
    public static void fun(TreeNode root)
    {
        if(root==null)
        return;
        ArrayList<Integer> list=new ArrayList<>();
        helper(root,list);
        int sum=0;
        for(int i=0;i<list.size();i++)
        sum+=list.get(i);
        if(sum/list.size()==root.val)
        c++;
        fun(root.left);
        fun(root.right);
    }
    public static void helper(TreeNode root,ArrayList<Integer> list)
    {
       if(root==null)
       return;
       list.add(root.val);
    //    cnt++;
       helper(root.left,list);
       helper(root.right,list);
    }
}