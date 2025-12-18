class Solution {
    public int mostFrequent(int[] nums, int key)
    {
       int n=nums.length;
       int[] ans=new int[1001];
       Arrays.fill(ans,0);
       for(int i=0;i<n-1;i++)
       {
        if(nums[i]==key)
        ans[nums[i+1]]++;
       } 
       int max=0,k=0;
       for(int i=0;i<ans.length;i++)
       {
       if(max<ans[i])
       {
        max=ans[i];
        k=i;
       }
       }
       return k;
    }
}