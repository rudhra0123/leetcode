class Solution {
    public int numSub(String s)
    {
          
    int cnt=0;
    long sum=0;
    final int MOD=1_000_000_007;
    for(int i=0;i<s.length();i++)
    { 
        if(s.charAt(i)=='1')
        cnt++;
        else
        {
            sum=(sum+((long)cnt*(cnt+1)/2)%MOD)%MOD;
            cnt=0;
        }
    }
    sum=(sum+((long)cnt*(cnt+1)/2)%MOD)%MOD;
    return (int)sum;
        
    }
}