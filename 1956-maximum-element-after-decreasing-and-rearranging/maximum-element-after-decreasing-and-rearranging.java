class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr)
    {
      Arrays.sort(arr);
      int max=Integer.MIN_VALUE;
      int n=arr.length;
      if(arr[0]!=1)
      arr[0]=1;
      if(n==1)
      return 1;
      for(int i=0;i<arr.length-1;i++)
      {
        int d=arr[i+1]-arr[i];
        if(d>1)
        arr[i+1]=arr[i]+1;
        max=Math.max(arr[i],max);
      } 
      if((arr[n-1]-arr[n-2])>1)
      arr[n-1]=arr[n-2]+1;
      max=Math.max(max,arr[n-1]); 
      return max;
    }
}