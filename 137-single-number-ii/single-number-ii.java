class Solution {
    public int singleNumber(int[] nums)
    {
       int[] arr=new int[32];
       int ans=0;
       for(int i=0;i<32;i++)
       {
        int count=0,temp=0;
        for(int num:nums)
        {
            if(((num>>i)&1)==1)
            {
              count++;
            }
        }
             int r=count%3;
             if(r!=0)
             ans=ans|(1<<i);
       }
       return ans;
    }
}