class Solution {
    public int countVowelStrings(int n)
    {
      if(n==1)
      return 5;
      int[][] dp=new int[n][5];
      for(int i=0;i<5;i++)
      dp[0][i]=1;
      int sum=0;
      for(int i=1;i<n;i++)
      {
        if(i==1)
        sum=5;
        for(int j=0;j<5;j++)
        { 
           if(j==0)
           dp[i][j]=sum;
           else
           {
           dp[i][j]=dp[i][j-1]-dp[i-1][j-1];
           sum+=dp[i][j];
           }

        }
      }
      return sum;

    }
}