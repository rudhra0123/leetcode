class Solution {
    public int[] leftRightDifference(int[] nums)
    {
      int lnt=nums.length;
      int[] left=new int[lnt];
      int[] right=new int[lnt];
      int[] ans=new int[lnt];
      int sum=0;
      for(int i=0;i<lnt;i++)
      {
      left[i]=sum;
      sum+=nums[i];
      } 
      sum=0;

      for(int i=lnt-1;i>=0;i--)
      {
        right[i]=sum;
        sum+=nums[i];
      } 
      for(int i=0;i<lnt;i++)
      {
        ans[i]=Math.abs(left[i]-right[i]);
      }
      return ans;
    }
}