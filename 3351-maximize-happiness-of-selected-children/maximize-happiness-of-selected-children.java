class Solution {
    public long maximumHappinessSum(int[] happiness, int k)
    {
        Arrays.sort(happiness);
        int n=happiness.length;
        int cnt=0,s=0;
        long sum=0;
        
        for(int i=n-1;i>=0;i--)
        {
           if((happiness[i]-s)>0)
           {
            sum+=(happiness[i]-s);
            s++;
           }
           else
           {
           break;
           }
           k--;
           if(k==0)
           break;
        }
        return sum;
        
    }
}