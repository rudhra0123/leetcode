class Solution {
    public boolean isOneBitCharacter(int[] bits) 
    {
        int n=bits.length;
        // // if(n%2!=0&&bits[n-2]!=1&&bits[n-1]==0)
        // // return true;
        // int result=0;
        // for(int i=n-1;i>=0;i--)
        // {
        // if(bits[i]==1)
        // {
        //     result=n-i-1;
        //     break;
        // }
        // }
        // if(result>1)
        // return true;
        // return false;
        boolean a=false;
        int i=0;
        while(i<n)
        {
            if(bits[i]==0)
            {
                a=true;
                i+=1;
            }
            else
            {
                a=false;
                i+=2;
            }
        }
        return a;

    }
}