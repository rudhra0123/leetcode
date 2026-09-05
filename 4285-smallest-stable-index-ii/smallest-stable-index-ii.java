class Solution {
    public int firstStableIndex(int[] nums, int k)
    {
      int n=nums.length;
       int[] maxarr=new int[n];
       int[] minarr=new int[n];
       int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
       for(int i=0;i<n;i++)
       {
        max=Math.max(nums[i],max);
        maxarr[i]=max;
       }
       for(int i=n-1;i>=0;i--)
       {
        min=Math.min(min,nums[i]);
        minarr[i]=min;
       }

       for(int i=0;i<n;i++)
       {
         if(maxarr[i]-minarr[i]<=k)
         {
            return i;
         }
       }
       return -1;   
    }
}