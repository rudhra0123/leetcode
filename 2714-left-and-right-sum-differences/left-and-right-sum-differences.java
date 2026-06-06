class Solution {
    public int[] leftRightDifference(int[] nums)
    {
      int[] ans=new int[nums.length];
      int[] leftarr=new int[nums.length];
      int[] rightarr=new int[nums.length];
      int n=nums.length;
      for(int i=1,j=n-2;i<n&&j>=0;i++,j--)
      {
        leftarr[i]=leftarr[i-1]+nums[i-1];
        rightarr[j]=rightarr[j+1]+nums[j+1];
        System.out.println(leftarr[i]);
      }  
      for(int i=0;i<n;i++)
      {
        ans[i]=Math.abs(leftarr[i]-rightarr[i]);
      }
      return ans;
    }
}