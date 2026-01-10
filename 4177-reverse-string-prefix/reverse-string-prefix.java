class Solution {
    public String reversePrefix(String s, int k)
    {
        String str1="";
        for(int i=k-1;i>=0;i--)
        {
           str1+=s.charAt(i);
        }
        for(int i=k;i<s.length();i++)
        {
            str1+=s.charAt(i);
        }
        return str1;
    }
}