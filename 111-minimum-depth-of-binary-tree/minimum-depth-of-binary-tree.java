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
    public int minDepth(TreeNode root)
    {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int cnt=0;
        if(root==null)
        return cnt;
        while(!q.isEmpty())
        {
            int size=q.size();
            cnt++;
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.poll();
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
                if(curr.left==null && curr.right==null)
                return cnt;
            }
            
        }
        return cnt;
        
    }
}