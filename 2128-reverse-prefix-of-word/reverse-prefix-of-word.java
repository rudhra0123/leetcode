class Solution {
    public String reversePrefix(String word, char ch)
    {
       int n=word.length();
       int  a=0;
       for(int i=0;i<n;i++)
       {
        if(word.charAt(i)==ch)
        {
            a=i;
            break;
        }
       } 
       String str="";
       for(int i=a;i>=0;i--)
       {
          str+=word.charAt(i);
       }
       for(int i=a+1;i<n;i++)
       {
         str+=word.charAt(i);
       }
       return str;
    }
}