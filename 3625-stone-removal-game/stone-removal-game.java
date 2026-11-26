class Solution {
    public boolean canAliceWin(int n)
    {
       if(n<10) 
       return false;
       int sum=10;
       boolean a=false;
       while(true)
       {
          n-=sum;
          if(n<0)
          break;
          a=!a;
          sum--;
       }
       return a;
    }
}