class Solution {
    public int countConsistentStrings(String allowed, String[] words)
    {
       int n1=allowed.length(),n2=words.length,cnt=0;
       ArrayList<Character> list=new ArrayList<>();
       for(int i=0;i<n1;i++)
       list.add(allowed.charAt(i));
       for(int i=0;i<n2;i++)
       {
       boolean a=true;
         for(int j=0;j<words[i].length();j++)
         {
             if(!list.contains(words[i].charAt(j)))
             a=false;
         }
         if(a)
         cnt++;
       }
       return cnt;

    }
}