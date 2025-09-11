class Solution {
    public String sortVowels(String s)
    {
        char[] arr=s.toCharArray();
        int n=s.length();
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if("aeiouAEIOU".indexOf(arr[i])!=-1)
            {
                list.add(arr[i]);
            }
        }
        // ArrayList<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        // list.sort(Map.Entry.comparingByValue());
        int k=0;
        Collections.sort(list);
        for(int i=0;i<n;i++)
        {
            if("aeiouAEIOU".indexOf(arr[i])!=-1)
            {
               arr[i]=list.get(k++);
            }
        }

        
        return new String(arr);
    }
}