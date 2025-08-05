class Solution {
    public int countHomogenous(String s)
    {
     
    int cnt=1;
    long sum=0;
    final int MOD=1_000_000_007;
    for(int i=1;i<s.length();i++)
    {
        if(s.charAt(i)==s.charAt(i-1))
        cnt++;
        else
        {
            sum = (sum+((long)cnt*(cnt+1)/2)%MOD)%MOD;
            cnt=1;
        }
    }
   sum = (sum+((long)cnt*(cnt+1)/2)%MOD)%MOD;
    return (int)sum;
    }
}