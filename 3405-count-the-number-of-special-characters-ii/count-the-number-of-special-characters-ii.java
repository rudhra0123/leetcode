class Solution {
    public int numberOfSpecialChars(String word)
    {
      HashMap<Character,Integer> map=new HashMap<>();
      for(int i=0;i<word.length();i++)
      {
        if(map.containsKey(word.charAt(i)))
        {
            if(Character.isUpperCase(word.charAt(i)))
            {
                // map.put(word.charAt(i),i);
                continue;
            }
            else
            {
                map.put(word.charAt(i),i);
            }
        }
        else
        {
            map.put(word.charAt(i),i);
        }
      }
      int cnt=0;
      for(Map.Entry<Character,Integer> entry:map.entrySet())
      {
        char ch=Character.toUpperCase(entry.getKey());
        if(map.containsKey(ch))
        {
           if(map.get(entry.getKey())<map.get(ch))
           {
            cnt++;
           }
        }

      }
      return cnt;

    }
}