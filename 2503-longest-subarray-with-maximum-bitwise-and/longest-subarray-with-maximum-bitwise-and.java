class Solution {
    public int longestSubarray(int[] nums)
    {
      int max=Integer.MIN_VALUE;
      for(int num:nums)
      max=Math.max(num,max);
      int count=0,len=0;
      for(int num :nums)
      {
        if(max==num)
        {
          count++;
          len=Math.max(count,len);
        }
        else
        count=0;

      }
      return len;
    }
}