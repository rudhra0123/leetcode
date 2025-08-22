class Solution {
    public int numSubmat(int[][] mat)
    {
        int m=mat.length;
        int n=mat[0].length;
        int arr[] =new int[n];
        int sum=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==0)
                arr[j]=0;
                else
                arr[j]++;
            }
            for(int j=0;j<n;j++)
            {
                int min=arr[j];
                for(int k=j;k<n;k++)
                {
                   min=Math.min(min,arr[k]);
                   sum+=min;
                }
            }
        }
        return sum;
    }
}