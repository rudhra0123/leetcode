class Solution {
    public int rob(int[] nums)
    {
        int l=nums.length;
        if(l==1)
        return nums[0];
        if(l==2)
        {
            return Math.max(nums[0],nums[1]);
        }
        int x=findmax(nums,0,l-2);
        int y=findmax(nums,1,l-1);
        return Math.max(x,y); 
    }
    public static int findmax(int[] nums,int s,int e)
    {
        int ans=nums[s];
        int ans2=Math.max(nums[s],nums[s+1]);
        for(int i=s+2;i<=e;i++)
        {
            int v=Math.max(ans+nums[i],ans2);
            
            int temp=ans2;
            ans2=v;
            ans=temp; 

        }
        return ans2;
    }
}