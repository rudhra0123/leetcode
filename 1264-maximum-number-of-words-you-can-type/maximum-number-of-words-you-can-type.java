class Solution {
    public int canBeTypedWords(String text, String brokenLetters)
    {
        int cnt=0;
        boolean a=true;
        int lnt=text.length();
        for(int i=0;i<lnt;i++)
        {
            char c=text.charAt(i);

            if(c==' ')
            {
                if(a)
                {
                cnt++; 
                }
                a=true;
            }
            else
            {
               if(brokenLetters.contains(String.valueOf(c)))
               {
                 a=false;
               }

            }
        }
        if(a)
        {
        cnt++; 
        }
        return cnt;
    }
}