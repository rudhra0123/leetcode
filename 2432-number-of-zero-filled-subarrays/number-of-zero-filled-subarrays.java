class Solution {
    public long zeroFilledSubarray(int[] nums)
    {
      long sum=0;
      long cnt=0;
      for(int num:nums)
      {
        if(num==0)
        cnt++;
        else
        {
            sum+=cnt*(cnt+1)/2;
            cnt=0;
        }
      }
        sum+=cnt*(cnt+1)/2;
        return sum;

    }
}