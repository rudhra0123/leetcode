class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums)
    {
       int lnt=nums.length;
       int n=1<<lnt;
       Set<List<Integer>> set=new HashSet<>();
       List<List<Integer>> list=new ArrayList<>();
       for(int i=0;i<n;i++)
       {
        List<Integer> l=new ArrayList<>();
        int sum=0;
        for(int j=0;j<lnt;j++)
        {
            if((i&(1<<j))>0)
            {
                l.add(nums[j]);
                sum+=nums[j];
            }
        }
            Collections.sort(l);
            set.add(l);
       } 
       for(List l:set)
       {
        list.add(l);
       }
       return list;
       
    }
}