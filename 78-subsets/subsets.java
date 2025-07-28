class Solution {
    public List<List<Integer>> subsets(int[] nums)
    {
        int lnt=nums.length;
        int n=1<<lnt;
       List<List<Integer>> list=new ArrayList<>();
       
       for(int i=0;i<n;i++)
       {
        List<Integer> l=new ArrayList<>();
        for(int j=0;j<lnt;j++)
        {
            if((i&(1<<j))>0)
            {
                l.add(nums[j]);
            }
        }
        list.add(l);
        // l.clear();
       }
       return list;
        
    }
}