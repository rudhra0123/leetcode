class Solution {
    public int specialTriplets(int[] nums)
    {
      HashMap<Integer,Integer> rmap =new HashMap<>();
      HashMap<Integer,Integer> lmap= new HashMap<>();
      int mod=1_000_000_007;
      int n=nums.length;
      for(int i=1;i<n;i++)
      {
        rmap.put(nums[i],rmap.getOrDefault(nums[i],0)+1);
      }
      int cnt=0;
      lmap.put(nums[0],1);
      for(int i=1;i<n-1;i++)
      {
        int left=0,right=0;
         if(rmap.get(nums[i])==1)
         {
            rmap.remove(nums[i]);
         }
         else
         {
            rmap.put(nums[i],rmap.get(nums[i])-1);
         }
         if(lmap.containsKey(nums[i]*2) && rmap.containsKey(nums[i]*2))
         {
           left=lmap.get(nums[i]*2);
           right=rmap.get(nums[i]*2);
           cnt = (int)((cnt+(long)left*right)%mod);
         }
         lmap.put(nums[i],lmap.getOrDefault(nums[i],0)+1);

      }
      
      return cnt;
      
    }
}