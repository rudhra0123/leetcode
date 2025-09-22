class Solution {
    public int maxFrequencyElements(int[] nums)
    {
        int n=nums.length;
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
            max=Math.max(max,map.get(num));
        }
        int cnt=0;
        System.out.println(max);
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==max)
            cnt+=entry.getValue();
        }
        return cnt;
    }
}