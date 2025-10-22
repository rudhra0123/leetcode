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
    public TreeNode constructMaximumBinaryTree(int[] nums)
    {
        return maxitree(nums,0,nums.length-1);
    }
    public int maxi(int[] nums,int a,int b)
    {
        int k=a,max=nums[a];
        for(int i=a;i<=b;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                k=i;
            }
        }
        return k;
    }
    public TreeNode maxitree(int[] nums,int left,int right)
    {
        if(left>right)
        return null;
        int mid=maxi(nums,left,right);
        TreeNode root=new TreeNode(nums[mid]);
        root.left=maxitree(nums,left,mid-1);
        root.right=maxitree(nums,mid+1,right);
        return root;
        
    }
}