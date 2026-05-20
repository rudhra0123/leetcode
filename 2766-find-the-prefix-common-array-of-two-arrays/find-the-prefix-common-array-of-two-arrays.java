class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B)
    {
      int n=A.length;
      int ans[]=new int[n];
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<n;i++)
      {
        if(!map.containsKey(A[i]))
        {
            map.put(A[i],1);
        }
        else
        {
            map.put(A[i],0);
        }
        if(!map.containsKey(B[i]))
        {
            map.put(B[i],1);
        }
        else
        {
            map.put(B[i],0);
        }
        int cnt=0;
        for(Integer val:map.values())
        {
            if(val==0)
            cnt++;
        }
        ans[i]=cnt;
      }
      return ans;
    }
}