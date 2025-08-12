class Solution {
    public int removeDuplicates(int[] nums)
    {
      ArrayList<Integer> list=new ArrayList<>();
      int cnt=1;
      list.add(nums[0]);
      for(int i=1;i<nums.length;i++)
      {
         if(nums[i]==nums[i-1])
         {
            cnt++;
         }
         else
         {
            cnt=1;
         }
         if(cnt<=2)
         list.add(nums[i]);
       
      }
      for(int i=0;i<list.size();i++)
      {
        nums[i]=list.get(i);
      }
      for(int i=list.size();i<nums.length;i++)
      nums[i]=0;
      return list.size();

      

    }
}