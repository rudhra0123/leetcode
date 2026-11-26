class Solution {
    public int coinChange(int[] coins, int amount)
    {
       int n=coins.length;
       if(amount==0)
       return 0;
       int[][] dp=new int[n][amount+1];
       for(int i=0;i<n;i++)
       dp[i][0]=0;

       for(int i=0;i<=amount;i++)
       {
        dp[0][i]=(i%coins[0]==0)?i/coins[0]:Integer.MAX_VALUE;
       }
       for(int i=1;i<n;i++)
       {
          for(int j=1;j<=amount;j++)
          {
           int nontake=dp[i][j]=dp[i-1][j];
           int take=Integer.MAX_VALUE;
            
            if(j>=coins[i] && dp[i][j-coins[i]]!=Integer.MAX_VALUE)
            {
                take=1+dp[i][j-coins[i]];
            }
            dp[i][j]=Math.min(take,nontake);
          }
       }
       return dp[n-1][amount]!=Integer.MAX_VALUE?dp[n-1][amount]:-1;

    }
}