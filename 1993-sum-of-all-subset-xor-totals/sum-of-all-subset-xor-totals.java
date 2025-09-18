class Solution {
    public int subsetXORSum(int[] nums)
    {
        int l=nums.length;
        int n=1<<l;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=0;j<l;j++)
            {
                if(((i>>j)&1)==1)
                {
                  sum^=nums[j];
                }
            }
            ans+=sum;
        }
        return ans;
        
    }
}