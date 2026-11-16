class Solution {
    public List<List<String>> groupAnagrams(String[] strs)
    {
       List<List<String>>  ans=new ArrayList<>();
       HashMap<String,ArrayList<Integer>> map=new HashMap<>();
       for(int i=0;i<strs.length;i++) 
       {
          char[] arr=strs[i].toCharArray();
          Arrays.sort(arr);
          String s=new String(arr);
          ArrayList<Integer> list=new ArrayList<>();
          if(!map.containsKey(s))
          {
            list.add(i);
            map.put(s,list);
          }
          else
          {
           ArrayList<Integer> lt=map.get(s);
           lt.add(i);
           map.put(s,lt);
          }
       }

       for(Map.Entry<String,ArrayList<Integer>> entry:map.entrySet())
       {
           ArrayList<Integer> as=entry.getValue();
           List<String> listans=new ArrayList<>();
           for(int i=0;i<as.size();i++)
           {
              listans.add(strs[as.get(i)]);
           }
           ans.add(listans);
       }
       return ans;
    }
}