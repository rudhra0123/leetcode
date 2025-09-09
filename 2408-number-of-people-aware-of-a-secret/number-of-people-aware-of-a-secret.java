class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget)
    {
        int[][] dp=new int[n][forget];
        int cnt=0;
        final int MOD = 1_000_000_007;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<forget;j++)
            {
                if(i==0 && j==0)
                {
                    dp[i][j]=1;
                }
                if(j>=delay-1 && j<forget-1 && i>0 && dp[i-1][j]>0)
                {
                    dp[i][0]=(dp[i][0]+dp[i-1][j])%MOD;

                }
                if(j>0 && i>0)
                {
                    
                    dp[i][j]=dp[i-1][j-1];
                }
            }
        }
        for(int i=0;i<forget;i++)
        cnt=(cnt + dp[n-1][i])%MOD;
        return cnt;
    }
}