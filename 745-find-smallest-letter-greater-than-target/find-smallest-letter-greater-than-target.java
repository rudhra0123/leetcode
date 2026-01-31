class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int max=0;
        char ch=letters[0];
        for(int i=0;i<letters.length;i++)
        {
            if((letters[i]-'0'>target-'0'))
            {
                if(max==0)
                {
                max=letters[i]-'0';
                ch=letters[i];
                }
                else if(max>letters[i]-'0')
                {
                    max=letters[i]-'0';
                    ch=letters[i];
                }
            }
        }
        return ch;
        
    }
}