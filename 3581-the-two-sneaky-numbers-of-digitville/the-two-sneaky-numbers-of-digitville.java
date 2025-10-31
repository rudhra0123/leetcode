class Solution {
    public int[] getSneakyNumbers(int[] nums)
    {
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        map.put(num,map.getOrDefault(num,0)+1);
        int a=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==2)
            ans[a++]=entry.getKey();
        }

      return ans;
    }
}