class Solution {
    public int maxCoins(int[] piles)
    {
     int n=piles.length;
     Arrays.sort(piles);
     int sum=0,i=0,a=0,j=n-1;
     while(true)
     {
       if(a==n/3)
       break;
       sum+=piles[j-1];
       j=j-2;
       a++;
     }
     return sum;   
    }
     
}