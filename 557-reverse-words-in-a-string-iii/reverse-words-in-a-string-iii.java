class Solution {
    public String reverseWords(String s)
    {
        int lnt=s.length();
        StringBuilder sb=new StringBuilder();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<lnt;i++)
        {
             if(s.charAt(i)!=' ')
            {
               sb.append(s.charAt(i));
            }
            else
            {
                str.append(sb.reverse());
                str.append(" ");
                sb.setLength(0);

            }
        }
        str.append(sb.reverse());
        return str.toString();
    }
}