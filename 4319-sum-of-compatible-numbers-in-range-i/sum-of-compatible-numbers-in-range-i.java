class Solution {
    public int sumOfGoodIntegers(int n, int k)
    {
       int a1=n-k,a2=n+k;
       if(a1<0)
       a1=0;
       int cnt=0;
       for(int i=a1;i<=a2;i++)
       {
        if(Math.abs(n-i)<=k && ((i&n)==0))
        cnt+=i;
       } 
       return cnt;  
    }
}