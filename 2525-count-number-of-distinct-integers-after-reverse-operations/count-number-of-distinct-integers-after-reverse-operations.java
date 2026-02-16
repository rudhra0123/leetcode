class Solution {
    public int countDistinctIntegers(int[] nums)
    {
      HashSet<Integer> set=new HashSet<>();
      for(int i=0;i<nums.length;i++)
      {
 
        int n=nums[i];
        int s=0;
        while(n>0)
        {
            int r=n%10;
            s=s*10+r;
            n=n/10;
        }
        set.add(nums[i]);
        set.add(s);
        System.out.println(nums[i]+""+s);
      }  
      return set.size();
    }
}