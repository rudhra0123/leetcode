class Solution {
    public int minimumBoxes(int[] apple, int[] capacity)
    {
        int sum=0;
        for(int num:apple)
        sum+=num;
        Arrays.sort(capacity);
        int n=capacity.length;
        int cnt=0;
        for(int i=n-1;i>=0;i--)
        {
           if(sum>capacity[i])
           {
            sum-=capacity[i];
            cnt++;
           }
           else
           break;
        }
        return cnt+1;
    }
}