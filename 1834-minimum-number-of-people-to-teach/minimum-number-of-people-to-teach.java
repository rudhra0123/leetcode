class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships)
    {
      int l=languages.length;
      HashMap<Integer,List<Integer>> map=new HashMap<>();
      for(int i=1;i<=l;i++)
      {
        ArrayList<Integer> list=new ArrayList<>();
        for(int j=0;j<languages[i-1].length;j++)
        {
            list.add(languages[i-1][j]);
        }
        map.put(i,list);
      }
      int max=0;
      HashSet<Integer> set=new HashSet<>();
      for(int i=0;i<friendships.length;i++)
      {
            ArrayList<Integer> temp=new ArrayList<>(map.get(friendships[i][0]));
            temp.retainAll(map.get(friendships[i][1]));
            if(temp.isEmpty())
            {
                set.add(friendships[i][0]);
                set.add(friendships[i][1]);
            }
      }
      HashMap<Integer,Integer> map2=new HashMap<>();
      for(int key:set)
      {
         List<Integer> nlist=map.get(key);
         for(int num:nlist)
         {
            map2.put(num,map2.getOrDefault(num,0)+1);
         }
      }

      for(Map.Entry<Integer,Integer> entry:map2.entrySet())
      {
        max=Math.max(entry.getValue(),max);
      }
      return set.size()-max;
    }
}