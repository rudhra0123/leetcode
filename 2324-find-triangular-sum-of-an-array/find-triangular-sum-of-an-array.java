class Solution {
    public int triangularSum(int[] nums)
    {
        int ans=0;
        if(nums.length==1)
        return nums[0];
        List<List<Integer>> boom=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        for(int num:nums)
        list.add(num);
        boom.add(list);
        int c=0;
        while(true)
        { 
            List<Integer> sam=new ArrayList<>();
            for(int i=0;i<boom.get(c).size()-1;i++)
            {
              int val=(boom.get(c).get(i)+boom.get(c).get(i+1))%10;
              sam.add(val);  
            }
            boom.add(sam);
            c++;
            if(sam.size()==1)
            {
                return sam.get(0);
            }
            else
            continue;
        }
            

        
    }
}