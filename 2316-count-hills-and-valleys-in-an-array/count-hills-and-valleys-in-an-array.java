class Solution {
    public int countHillValley(int[] nums)
    {
       ArrayList<Integer> list=new ArrayList<>();
       int cnt=0;
       if(nums.length<3)
       return 0;
       list.add(nums[0]);
       for(int i=1;i<nums.length;i++)
       {
        if(nums[i]!=nums[cnt])
        {
        list.add(nums[i]);
        }
        cnt++;
       }
       int count=0;
       for(int i=1;i<list.size()-1;i++)
       {
        int l=list.get(i-1);
        int h=list.get(i+1);
        int val=list.get(i);
        if((l<val && h<val) ||(l>val && h>val))
        count++;
       }
       System.out.println(list);
       return count;
    }
}