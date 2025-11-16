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
    static int mindepth;
    static int sum;
    public int deepestLeavesSum(TreeNode root) {
       sum=0;
       TreeNode samuu=root;
       int d=fun(root);
       fun2(samuu,d);
       return sum;
    }
    public int fun(TreeNode root)
    {
        if(root==null)
        return 0;
        int left=fun(root.left);
        int right=fun(root.right);
 
        if (left == 0) return 1 + right;
       if (right == 0) return 1 + left;

      return 1 + Math.max(left, right);
    }
    public void fun2(TreeNode root,int d)
    {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
               if(d==1)
                {
                    int s=q.size();
                  for(int i=0;i<s;i++)
                  sum+=q.poll().val;
                  return;
                  
                }
            
                d--;
                for(int i=0;i<size;i++)
                {
                  TreeNode curr=q.poll();
                  if(curr.left!=null)
                  q.add(curr.left);
                  if(curr.right!=null)
                  q.add(curr.right);
                }
                
            
        }
    }
}