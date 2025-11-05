class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=groupSizes.length;
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(groupSizes[i]))
            {
                List<Integer> list=new ArrayList<>();
                list.add(i);
                map.put(groupSizes[i],list);
            }
            else
            {
              

                map.get(groupSizes[i]).add(i);
            }
            if (map.get(groupSizes[i]).size()==groupSizes[i]) {
                ans.add(new ArrayList<>(map.get(groupSizes[i])));
                map.get(groupSizes[i]).clear();
            }
        }
        for(Map.Entry<Integer,List<Integer>> entry:map.entrySet())
        {
            if(entry.getValue().size()!=0)
            ans.add(entry.getValue());
        }
        return ans;




        
    }
}