class Solution {
    public int maxIceCream(int[] costs, int coins)
    {
       Arrays.sort(costs);
       int sum=0,cnt=0,a=0;
       if(costs[0]>coins)
       return 0;
       for(int i=0;i<costs.length;i++)
       {
        sum+=costs[a++];
           if(sum>coins)
           {
            a--;
            break;
           }
           else if(sum==coins)
           break;
       }
       return a;
    }
}