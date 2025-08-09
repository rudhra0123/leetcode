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
    public boolean isEvenOddTree(TreeNode root)
    {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        if(root.val%2==0)
        return false;
         
        int cnt=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            cnt++;
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
               TreeNode curr=q.poll();
               list.add(curr.val);
               if(cnt%2!=0)
               {
                 if(curr.val%2==0)
                 return false;
                 if(list.size()>1)
                 {
                    if(list.get(list.size()-2)>=list.get(list.size()-1))
                    return false;
                 }

               }
               else
               {
                if(curr.val%2!=0)
                return false;
                if(list.size()>1)
                 {
                    if(list.get(list.size()-2)<=list.get(list.size()-1))
                    return false;
                 }
               }
               if(curr.left!=null)
               q.add(curr.left);
               if(curr.right!=null)
               q.add(curr.right);

            }

        }
        return true;
    }
}