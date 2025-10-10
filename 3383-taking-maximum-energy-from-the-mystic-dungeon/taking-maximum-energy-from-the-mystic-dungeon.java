class Solution {
    public int maximumEnergy(int[] energy, int k) 
    {
        int lnt=energy.length;
        int[] dp=new int[lnt];
        for(int i=lnt-1;i>=lnt-k;i--)
        {
           dp[i]=energy[i];
        //    System.out.println(dp[i]);
        }
        for(int i=lnt-k-1;i>=0;i--)
        {
            dp[i]=dp[i+k]+energy[i];
        //    System.out.println(dp[i]);

        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<lnt;i++)
        {
           max=Math.max(dp[i],max);
        }
        return max;

    }
}