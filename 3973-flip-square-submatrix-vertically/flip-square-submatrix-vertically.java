class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k)
    {
        int temp=k;
        int[][] arr=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
            {
                for(int j=0;j<grid[i].length;j++)
                    {
                        if(i>=x && j>=y && i<x+k && j<y+k)
                        {
                        arr[i][j]=grid[x+(k-1-(i-x))][j];  
                        }
                        else
                        arr[i][j]=grid[i][j];
                    }
            }
        return arr;
        
    }
}