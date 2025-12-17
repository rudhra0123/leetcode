class Solution {
    public String frequencySort(String s)
    {
      int n=s.length();
      HashMap<Character,Integer> map=new HashMap<>();
      for(int i=0;i<n;i++)
      {
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
      }  
      ArrayList<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
      Collections.sort(list,(a,b)->
      {
        // if(a.getValue().equals(b.getValue()))
        return b.getValue()-a.getValue();
      });
      String str="";
      for(Map.Entry<Character,Integer> entry:list)
      {
        int k=entry.getValue();
        while(k-->0)
        {
            str+=entry.getKey();
        }
      } 
    
      return str;
    }
}