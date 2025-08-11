class Solution {
    public int[] productQueries(int n, int[][] queries)
    {
       int mod=1000000007;
       int[] powers=new int[Integer.bitCount(n)];
       int k=0;
       int[] arr=new int[32];
       arr[0]=1;
       for(int i=1;i<32;i++)
       {
        arr[i]=(int)((arr[i-1]*2L)%mod);
       }
       for(int i=0;i<32;i++)
       {
         if((n&(1<<i))!=0)
         {
          powers[k]=arr[i];
          k++;
         }
         
       }
       int[] ans=new int[queries.length];
       for(int i=0;i<queries.length;i++)
       {
         long sum=1;
        for(int j=queries[i][0];j<=queries[i][1];j++)
        {
           sum=((sum*(powers[j])%mod)%mod);
        //    System.out.println(sum+" "+i+" "+powers[j]);
           
        }
        ans[i]=(int)sum;
       }
      return ans;

    }
}