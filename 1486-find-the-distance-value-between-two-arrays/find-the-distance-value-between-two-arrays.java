class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d)
    {
       Arrays.sort(arr2);
       int cnt=0;
       for(int i=0;i<arr1.length;i++)
       {
         int min=Integer.MAX_VALUE;
        //  int low=0,,high=arr2.length-1,ele=0;
         for(int j=0;j<arr2.length;j++)
         {
            min=Math.min(min,Math.abs(arr2[j]-arr1[i]));
         }
         if(min>d)
         cnt++;
       } 
       return cnt;
    }
}