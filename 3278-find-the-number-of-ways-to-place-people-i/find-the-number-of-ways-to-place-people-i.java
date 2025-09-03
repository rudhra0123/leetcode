class Solution {
    public int numberOfPairs(int[][] points)
    {
        int lnt=points.length;
        int cnt=0,max=0;
        sortu(points);
        for(int[] num:points)
        System.out.println(Arrays.toString(num));
        for(int i=0;i<lnt;i++)
        {
            max=points[i][1];
            int m=Integer.MIN_VALUE;
            for(int j=i+1;j<lnt;j++)
            {
                if(points[i][0]<=points[j][0] && points[i][1]>=points[j][1])
                {
                if(m<max && m<points[j][1])
                {
                   cnt++;
                   m=points[j][1];
                }
                }
            }
            
        }
        return cnt;
        
    }
    public int[][] sortu(int[][] points)
    {
        Arrays.sort(points,(a,b)->
        {
            if(a[0]==b[0])
            return b[1]-a[1];
            else
            return a[0]-b[0];
        });
        return points;
    }
}