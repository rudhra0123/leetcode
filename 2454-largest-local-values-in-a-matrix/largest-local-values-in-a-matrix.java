class Solution {
    public int[][] largestLocal(int[][] grid) 
    {
        int start=0,end=2,up=0,down=2;
        int n=grid.length;
        int[][] ans=new int[n-2][n-2];
        ArrayList<Integer> list=new ArrayList<>();
        while(start<n && end<n && up<n && down<n)
        {
            int max=Integer.MIN_VALUE;
            for(int i=up;i<=down;i++)
            {
              for(int j=start;j<=end;j++)
              {
                max=Math.max(max,grid[i][j]);
              }
            }
            list.add(max);
            System.out.println(max);
            start++;
            end++;
            if(end==n)
            {
                start=0;
                end=2;
                up++;
                down++;
            }
        }
        int a=0;
        for(int i=0;i<n-2;i++)
        {
            for(int j=0;j<n-2;j++)
            {
                ans[i][j]=list.get(a++);
            }
        }
        return ans;
    }
}