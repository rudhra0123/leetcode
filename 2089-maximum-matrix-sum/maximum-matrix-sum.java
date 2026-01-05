class Solution {
    public long maxMatrixSum(int[][] matrix)
    {
        long sum=0;
        long cnt=0,n=matrix.length,min=Long.MAX_VALUE;
        boolean a=false;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]<0)
                {
                cnt++;
                }
                min=Math.min(Math.abs(matrix[i][j]),min);
                sum+=Math.abs(matrix[i][j]);
            }
        }
        // System.out.println(max);
        // System.out.println(cnt);
        if(cnt%2==0)
        return sum;
        System.out.println("sum"+sum);
        return sum-2*(Math.abs(min));
        
    }
}