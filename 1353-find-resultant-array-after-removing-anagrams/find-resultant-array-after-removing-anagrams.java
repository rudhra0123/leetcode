class Solution {
    public List<String> removeAnagrams(String[] words)
    {
       List<String> list=new ArrayList<>();
       for(String word:words)
       list.add(word);
       int i=1;
       while(i<list.size())
       {
        if(sortu(list.get(i)).equals(sortu(list.get(i-1))))
        {
            list.remove(i);
        }
        else
        {
            i++;
        }
       }
       return list;
    }
    public String sortu(String word)
    {
        char[] chars=word.toCharArray();
        Arrays.sort(chars);
        String str=new String(chars);
        return str;
    }
}