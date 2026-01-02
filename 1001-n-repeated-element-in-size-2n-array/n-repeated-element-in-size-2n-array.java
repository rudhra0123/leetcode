class Solution {
    public int repeatedNTimes(int[] nums)
    {
        int n=nums.length;
        int[] arr=new int[10001];
        for(int i=0;i<n;i++)
        {
            arr[nums[i]]++;
            if(arr[nums[i]]==n/2)
            return nums[i];
        }
        return 0;
    }
}