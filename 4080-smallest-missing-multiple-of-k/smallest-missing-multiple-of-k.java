class Solution {
    public int missingMultiple(int[] nums, int k)
    {
       ArrayList<Integer> list=new ArrayList<>();
       int k1=k;
       for(int i=0;i<nums.length;i++)
       {
        list.add(nums[i]);
       } 
       while(true)
       {
        if(list.contains(k))
        {
           k+=k1;
        }
        else
        {
            break;
        }
       }
       return k;
    }
}