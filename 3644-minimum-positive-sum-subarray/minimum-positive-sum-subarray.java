class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r)
    {
      int n=nums.size();
      ArrayList<Integer> list=new ArrayList<>();
      int min=Integer.MAX_VALUE;
      for(int i=0;i<n;i++)
      {
        for(int j=i;j<n;j++)
        {
            int sum=0;
            ArrayList<Integer> sub=new ArrayList<>();
            for(int k=i;k<=j;k++)
            {
              sub.add(nums.get(k));   
              sum+=nums.get(k);  
            }
            if((sub.size()>=l) && (sub.size()<=r))
            if(sum>0)
            {
              min=Math.min(min,sum);
            }
        }

      }
     
      return min==Integer.MAX_VALUE?-1:min;
    }
}