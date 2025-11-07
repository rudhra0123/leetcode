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
    public List<Double> averageOfLevels(TreeNode root)
    {
        List<Double> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        return list;
        else
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            ArrayList<Integer> ans=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode c=q.poll();
                ans.add(c.val);
                if(c.left!=null)
                q.add(c.left);
                if(c.right!=null)
                q.add(c.right);
            }
            double sum=0;
            for(int i=0;i<ans.size();i++)
            sum+=ans.get(i);
            list.add((double)sum/ans.size());
        }
        return list;
        
    }
}