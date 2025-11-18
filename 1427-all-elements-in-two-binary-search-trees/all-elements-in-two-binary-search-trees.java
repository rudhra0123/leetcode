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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2)
    {
        List<Integer> list=new ArrayList<>();
        fun(root1,list);
        fun2(root2,list);
        Collections.sort(list);
        return list;
    }
    public void fun(TreeNode root,List<Integer> list)
    {
        if(root==null)
        return;
        list.add(root.val);
        System.out.println(root.val);
        fun(root.left,list);
        fun(root.right,list);
    }
    public void fun2(TreeNode root,List<Integer> list)
    {
        if(root==null)
        return;
        System.out.println(root.val);
        list.add(root.val);
        fun2(root.left,list);
        fun2(root.right,list);
    }
}