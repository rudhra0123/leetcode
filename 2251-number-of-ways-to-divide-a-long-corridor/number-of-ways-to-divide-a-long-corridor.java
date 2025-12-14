class Solution {
    public int numberOfWays(String corridor)
    {
      int mod=1000000007;
      int n=corridor.length(),cnt=0;
      ArrayList<Integer> list=new ArrayList<>();
      long c=1;
      for(int i=0;i<n;i++)
      {
        if(corridor.charAt(i)=='S')
        {
            list.add(i);
        }
      }
      if(list.size()==0 ||list.size()%2!=0)
      return 0;
      if(list.size()==2)
      return 1;
      for(int i=2;i<list.size();i+=2)
      {
        int gap=list.get(i)-list.get(i-1);
        c=(c*gap)%mod;
      }
    //   for(int i=n-1;i>=0;i)
      return (int)c;
    }
}