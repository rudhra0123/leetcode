class Solution {
    public int longestMonotonicSubarray(int[] nums)
    {
      int n=nums.length;
      int max=Integer.MIN_VALUE;
      if(n==1)
      return 1;
      for(int i=0;i<n;i++)
      {
         for(int j=i;j<n;j++)
         {
            int in=0,dc=0;
            for(int k=i;k<j;k++)
            {
               if(nums[k]<nums[k+1])
               {
                in++;
                dc=0;
               }
               else if(nums[k]==nums[k+1])
               {
                in=0;
                dc=0;
               }
               else
               {
                in=0;
                dc++;
               }
               max=Math.max(max,(Math.max(in,dc)));
            }
         }
      }
      return max+1;  
    }
}