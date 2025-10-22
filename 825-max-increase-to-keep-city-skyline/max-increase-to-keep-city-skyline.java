class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid)
    {
       int sum=0;
       for(int i=0;i<grid.length;i++)
       {
        for(int j=0;j<grid[i].length;j++)
        {
           int a=maxuu(grid,i,j);
           if(grid[i][j]<a)
           {
            sum+=a-grid[i][j];
           }
           
        }
       } 
       return sum;
    }
    public int maxuu(int[][] grid,int a,int b)
    {
        int max1=0,max2=0;
        for(int i=0;i<grid.length;i++)
        {
           max1=Math.max(max1,grid[a][i]);
           max2=Math.max(max2,grid[i][b]);
        }
        return Math.min(max1,max2);
    }
}