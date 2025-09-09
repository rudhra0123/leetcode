class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int k=grid[0].length;
        int[][] dp=new int[n][k];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<k;j++)
            {
                if(i==0 && j==0)
                dp[i][j]=grid[i][j];
                if(i==0 && j>0)
                {
                   dp[i][j]=dp[i][j-1]+grid[i][j]; 
                }
                else if(j==0 && i>0)
                {
                    dp[i][j]=grid[i][j]+dp[i-1][j];
                }
                else if(i!=0 && j!=0)
                {
                    dp[i][j]=Math.min(dp[i][j-1],dp[i-1][j])+grid[i][j];
                }
                System.out.println(dp[i][j]);
                
            }
        }
        return dp[n-1][k-1];
    }
}