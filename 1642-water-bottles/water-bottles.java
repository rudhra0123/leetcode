class Solution {
    public int numWaterBottles(int numBottles, int numExchange)
    {
        int sum=numBottles;
        while(numBottles>=numExchange)
        {

          int r=numBottles/numExchange;
          int c=numBottles%numExchange;
          sum+=r;
          numBottles=c+r; 
        }
        return sum;
    }
}