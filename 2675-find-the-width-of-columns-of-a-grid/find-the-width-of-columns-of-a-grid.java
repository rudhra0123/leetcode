class Solution {
    public int[] findColumnWidth(int[][] grid) 
    {
       int n=grid[0].length;
       int[] ans=new int[n];
       for(int i=0;i<grid.length;i++)
       {
        for(int j=0;j<grid[i].length;j++)
        {

           int a=Integer.toString(grid[i][j]).length();
           System.out.println(a);
           ans[j]=Math.max(ans[j],a);
        }
       } 
       return ans;
    }
}