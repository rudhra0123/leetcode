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
    public int maxLevelSum(TreeNode root)
    {
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        return 0;
        else
        q.add(root);
        int max=Integer.MIN_VALUE;
        int a=0,k=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            int sum=0;
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.poll();
                sum+=curr.val;
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
            }
            a++;
            if(max<sum)
            {
                max=sum;
                System.out.println(sum);
                k=a;
            }
        }
        return k;
    }
}