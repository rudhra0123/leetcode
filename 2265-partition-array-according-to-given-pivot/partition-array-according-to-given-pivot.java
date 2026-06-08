class Solution {
    public int[] pivotArray(int[] nums, int pivot)
    {
      int n=nums.length;
      ArrayList<Integer> list1=new ArrayList<>();
      ArrayList<Integer> list2=new ArrayList<>();
      int[] ans=new int[n];
      int c=0,a=0;
      for(int i=0;i<n;i++)
      {
        if(nums[i]<pivot)
        list1.add(nums[i]);
        else if(nums[i]>pivot)
        list2.add(nums[i]);
        else
        c++;
      } 
      for(int i=0;i<n;i++)
      {
         if(i<list1.size())
         {
            ans[i]=list1.get(i);
         }
         else if(c>0)
         {
            ans[i]=pivot;
            c--;
         }
         else
         {
            ans[i]=list2.get(a++);
         }


      } 
      return ans;
    }
}