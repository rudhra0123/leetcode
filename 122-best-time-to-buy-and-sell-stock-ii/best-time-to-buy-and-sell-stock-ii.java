class Solution {
    public int maxProfit(int[] prices)
    {
        int l=prices.length;
        int[] dp=new int[l];
        int sum=0;
        for(int i=0;i<l-1;i++)
        {
           if(prices[i]<prices[i+1])
           sum+=prices[i+1]-prices[i];
        }
        return sum;
    }
}