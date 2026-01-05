class Solution {
    public int sumFourDivisors(int[] nums)
    {
      int sum=0;
      for(int i=0;i<nums.length;i++)
      {
        sum+=divisorss(nums[i]);
      }
      return sum;

    }
    public int divisorss(int num)
    {
        int sos=0,cnt=0;
        for(int i=1;i*i<=num;i++)
        {
           if(num%i==0)
           {
            int d1=i;
            int d2=num/i;
            if(d1==d2)
            {
                cnt++;
                sos+=d1;
            }
            else
            {
                cnt+=2;
                sos+=d1+d2;
            }
            if(cnt>4)
            return 0;
           }
           
        }
        if(cnt==4)
        return sos;
        return 0;
       
    }
}