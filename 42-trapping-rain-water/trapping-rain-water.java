class Solution {
    public int trap(int[] height)
    {
       int n=height.length;
       int[] dp1=new int[n];
       int[] dp2=new int[n];
       int[] ans=new int[n];
       int max1=0,max2=0;
       int i=0,j=n-1;
       while(i<n && j>=0)
       {
          max1=Math.max(max1,height[i]);
          max2=Math.max(max2,height[j]);
          dp1[i]=max1;
          dp2[j]=max2;
          i++;
          j--;
       }
       int cnt=0;
       for(int k=0;k<n;k++)
       {
         ans[k]=Math.min(dp1[k],dp2[k]);
         if(ans[k]>height[k])
         {
            cnt+=ans[k]-height[k];
         }
       }
       return cnt;
    }
}