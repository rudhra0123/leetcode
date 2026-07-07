class Solution {
    public long sumAndMultiply(int n)
    {
        int t=n;
        long x=0,sum=0,k=0;
        while(n>0)
        {
            int r=n%10;
            if(r!=0)
            {
                sum+=r;
                x=(int)(r*(Math.pow(10,k)))+x;
                k++;
            }
            n/=10;
        }
        return x*sum;
    }
}