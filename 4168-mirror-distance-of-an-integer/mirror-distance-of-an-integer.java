class Solution {
    public int mirrorDistance(int n)
    {
      int rev=0;
      int n1=n;
      while(n>0)
      {
        int r=n%10;
        rev=rev*10+r;
        n/=10;
      } 
      return Math.abs(rev-n1); 
    }
}