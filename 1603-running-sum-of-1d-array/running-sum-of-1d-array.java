class Solution {
    public int[] runningSum(int[] nums)
    {
       int lnt=nums.length,a=0;
       int[] arr=new int[lnt];
       for(int i=0;i<lnt;i++)
       {
          a+=nums[i];
          arr[i]=a;
       }
       return arr;   
    }
}