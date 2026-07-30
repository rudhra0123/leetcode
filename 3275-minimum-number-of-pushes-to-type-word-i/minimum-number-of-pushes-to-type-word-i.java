class Solution {
    public int minimumPushes(String word)
    {
      int n=word.length();
      int sum=0;
      while(n>0)
      {
        if(n<=8)
        {
            sum+=n;
            break;
        }
        else if(n>8 && n<=16)
        {
            int r2=n%8;
            if(r2==0)
            {
                sum+=8*2;
                n-=8;
            }
            n-=r2;
            sum+=r2*2;
        }
        else if(n>16 && n<=24)
        {
            int r3=n%8;
            if(r3==0)
            {
            sum+=8*3;
            n-=8;
            }
            n-=r3;
            sum+=r3*3;
        }
        else
        {
            int r4=n%8;
            sum+=r4*4;
            n-=r4;
        }
      }
      return sum;

    }
}