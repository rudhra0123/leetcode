class Solution {
    public int totalMoney(int n)
    {
        int a=1,b=7,sum=0,t=n;
        while(t>0)
        {
           for(int i=a;i<=b && t>0 ;i++) 
           {
            sum+=i;
            t--;
           }
           a++;
           b++;
        }
        return sum;
    }
}