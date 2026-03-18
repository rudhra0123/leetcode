class Solution {
    public int[] numberGame(int[] nums)
    {
       Arrays.sort(nums);
       int[] ans=new int[nums.length];
       int a=0,b=1;
       for(int i=0;i<nums.length;i++)
       {
        if(i%2==0)
        {
        ans[i]=nums[b];
        b=b+2;
        }
        else
        {
        ans[i]=nums[a];
        a=a+2;
        }
       } 
       return ans;
    }
}