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
    public int countNodes(TreeNode root)
    {
       ArrayList<Integer> list=new ArrayList<>();
       cntNodes(root,list);
       return list.size();
    }
    public List<Integer> cntNodes(TreeNode root,ArrayList<Integer> list )
    {
     if(root==null)
     return list;
    //  System.out.println(root.val);
     list.add(root.val);
     cntNodes(root.left,list);
     cntNodes(root.right,list); 
     return list;
    }
}