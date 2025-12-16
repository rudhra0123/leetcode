class Solution {
    public int matrixScore(int[][] grid)
    {
       int n=grid.length;
       int m=grid[0].length;
       for(int i=0;i<n;i++)
       {
         if(grid[i][0]==0)
         {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==0)
                grid[i][j]=1;
                else
                grid[i][j]=0;
            }
         }
    //    System.out.println(Arrays.toString(grid[i]));
       } 
       for(int j=0;j<m;j++)
       {
        int cnt1=0,cnt2=0;
        for(int i=0;i<n;i++)
        {
            if(grid[i][j]==0)
            cnt1++;
            else
            cnt2++;
        }
        if(cnt2<cnt1)
        {
            for(int i=0;i<n;i++)
            {
                grid[i][j]=(grid[i][j]==0)?1:0;
            }
        }
       }
       int sum=0;
       for(int i=0;i<n;i++)
       {
        int k=m;
        for(int j=0;j<m;j++)
        {
           sum+=(Math.pow(2,k-1)*grid[i][j]);
           k--;
        }
       }
       return sum;
    }
}