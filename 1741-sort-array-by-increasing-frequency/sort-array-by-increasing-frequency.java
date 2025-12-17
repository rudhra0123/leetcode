class Solution {
    public int[] frequencySort(int[] nums)
    {
      int n=nums.length;
      int[] ans=new int[n];
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int num:nums)
      {
        map.put(num,map.getOrDefault(num,0)+1);
      } 
      int c=0;
      ArrayList<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
      Collections.sort(list,(a,b)->
      {
        if(!a.getValue().equals(b.getValue()))
        return a.getValue()-b.getValue();
        else
        return b.getKey()-a.getKey();
      });
      for(Map.Entry<Integer,Integer> entry:list)
      {
        int k=entry.getValue();
        while(k-->0)
        {
           ans[c++]=entry.getKey();
        }
      }
      return ans;
    }
}