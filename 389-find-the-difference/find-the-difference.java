class Solution {
    public char findTheDifference(String s, String t)
    {
        ArrayList<Character> list=new ArrayList<>();
        int l=s.length();
        char a='\0';
        for(int i=0;i<l;i++)
        list.add(s.charAt(i));
        for(int i=0;i<t.length();i++)
        {
            if(!list.contains(t.charAt(i)))
            a = t.charAt(i);  
            else
            list.remove(Character.valueOf(t.charAt(i))); 
        }
        return a;
    }
}