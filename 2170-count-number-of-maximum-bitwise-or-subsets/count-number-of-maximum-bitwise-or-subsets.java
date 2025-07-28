class Solution {
    public int countMaxOrSubsets(int[] nums)
    {
       int lnt=nums.length;
       int or=0;
       int n=1<<lnt;
       for(int num:nums)
       or|=num;
       int count=0;
       for(int i=1;i<n;i++)
       {
        int sum=0;
        for(int j=0;j<lnt;j++)
        {
            
            if((i&(1<<j))>0)
            {
             sum|=nums[j];
            }
        }
        if(sum==or)
        count++;
       }
       return count;

    }
}