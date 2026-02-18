class Solution {
    public boolean hasAlternatingBits(int n)
    {
       int a=0,bit=-1;
       while(n>0)
       {
        a=bit;
        bit=n&1;
        if(a==bit)
        return false;
        // if(bit==0)
        // {
        //     a=true;
        // }
        // else
        // {
        //     a=false;
        // }
        n=n>>1;
       }  
       return true;  
    }
}