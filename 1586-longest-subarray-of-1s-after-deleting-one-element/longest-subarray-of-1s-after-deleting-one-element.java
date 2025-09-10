class Solution {
    public int longestSubarray(int[] nums)
    {
      int zero=0,cnt=0,max=0,n=nums.length,i=0,ind=0;
      while(i<n)
      {
        if(nums[i]==0)
        {
            zero++;
            if(zero>1)
            {
                zero--;
                cnt=i-ind-1;
            }
            ind=i;
            
        }
        else
        {
            cnt++;
        } 
        max=Math.max(max,cnt);
        i++;
      }  
      return max==n?n-1:max;
    }
}