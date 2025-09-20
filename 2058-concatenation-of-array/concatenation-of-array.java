class Solution {
    public int[] getConcatenation(int[] nums)
    {
        int n=nums.length;
        int[] ans=new int[n*2];
        int i=0,j=0;
        while(j<n*2)
        {
          ans[j]=nums[i];
          if(i==n-1)
          {
           i=0;
           j++;
          }
          else
          {
          i++;
          j++;
          }
        }
        return ans;
    }
}