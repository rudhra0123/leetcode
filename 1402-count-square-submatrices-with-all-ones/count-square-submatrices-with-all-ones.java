class Solution {
    public int countSquares(int[][] matrix)
    {
        int r=matrix.length;
        int d=matrix[0].length,sum=0;
        for(int i=0;i<r;i++)
        {
          for(int j=0;j<d;j++)
          {
            if(i!=0 && j!=0)
            {
            int a=matrix[i][j-1];
            int b=matrix[i-1][j];
            int c=matrix[i-1][j-1];
            int min=(a<b&&a<c)?a:((b<c)?b:c);
            if(matrix[i][j]!=0)
            matrix[i][j]=min+1;
            }
            sum+=matrix[i][j];
          }

        }
        return sum;
        
    }
}