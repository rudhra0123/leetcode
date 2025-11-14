class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries)
    {
        int[][] ans=new int[n][n];
        int l=queries.length;
        for(int i=0;i<l;i++)
        {
            int row1=queries[i][0];
            int row2=queries[i][2];
            int col1=queries[i][1];
            int col2=queries[i][3];

            for(int j=row1;j<=row2;j++)
            {
                ans[j][col1]+=1;
                if(col2<n-1)
                {
                    ans[j][col2+1]-=1;
                }

            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                ans[i][j]=ans[i][j]+ans[i][j-1];
            }
        }
        for(int i=0;i<n;i++)
        System.out.println(Arrays.toString(ans[i]));
        return ans;
    }
}