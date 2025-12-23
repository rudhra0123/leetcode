class Solution {
    public int[] sortArrayByParity(int[] nums)
    {
        int n=nums.length;
        int[] ans=new int[n];
        int a=0,b=n-1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==0)
            {
                ans[a++]=nums[i];
            }
            else
            {
                ans[b--]=nums[i];
            }
        }
        return ans;
    }
}