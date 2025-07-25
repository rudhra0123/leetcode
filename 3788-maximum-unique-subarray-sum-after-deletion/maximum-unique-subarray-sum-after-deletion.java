class Solution {
    public int maxSum(int[] nums)
    {
        // if(nums.length==1)
        // return nums[0];
        int max=Integer.MIN_VALUE;
        for(int num:nums)
        max=Math.max(num,max);
        if(max<0)
        return max;
        int sum=0;
        Set<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            if(num>0)
            set.add(num);
        }
        for(int num:set)
        sum+=num;
        return sum;

        
    }
}