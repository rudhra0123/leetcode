class Solution {
    public int maxProfit(int[] prices)
    {
       int n=prices.length;
       int max=0,min=Integer.MAX_VALUE;
       for(int i=0;i<n;i++)
       {
         if(min>prices[i])
         {
           min=prices[i];
         }
         max=Math.max(max,prices[i]-min);
       } 
       return max;
    }
}