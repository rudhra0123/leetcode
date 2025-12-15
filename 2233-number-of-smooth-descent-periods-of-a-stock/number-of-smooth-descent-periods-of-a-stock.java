class Solution {
    public long getDescentPeriods(int[] prices)
    {
      int n=prices.length;

      long[] dp=new long[n+1];
      dp[0]=0;
      for(int i=1;i<=n;i++)
      {
         dp[i]=dp[i-1]+i;
      }
      long cnt=0;
      int[][] ans=new int[n][2];
      ans[0][1]=1;
      ans[0][0]=prices[0];
      for(int i=1;i<n;i++)
      {
        ans[i][0]=prices[i];
         if((prices[i-1]-prices[i])==1)
         {
            ans[i][1]=ans[i-1][1]+1;
         }
         else
         {
            ans[i][1]=1;
         }
         System.out.println(ans[i][0]+" "+ans[i][1]);
      }
      int k=ans[0][1];
      for(int i=1;i<n;i++)
      {
        if(ans[i][1]<ans[i-1][1])
        {
            cnt+=dp[ans[i-1][1]];
        }
        if (ans[i][1]==1&&ans[i-1][1]==1) {
        cnt += 1;
        }

        k=ans[i][1];
      }
      cnt+=dp[k];
      return cnt;

    }
}