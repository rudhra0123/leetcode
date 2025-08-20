class Solution {
    public boolean validPalindrome(String s)
    {
      int j=s.length()-1,i=0;
      int a=0,b=0,c=0;
      while(i<=j)
      {
        if(s.charAt(i)==s.charAt(j))
        {
            i++;
            j--;
        }
        else
        {
            if(j-i==1)
            return true;
            else if(a==0)
            {
              if(s.charAt(i)==s.charAt(j-1)&&ispal(s,i,j-1))
              {
              j--;
              a++;
              }
              else if(s.charAt(i+1)==s.charAt(j)&&ispal(s,i+1,j))
              {
              i++;
              a++;
              }
              else
              return false;
              b=i;
              c=j;
            }
            else if(a==1)
            {
                return ispal(s,b+1,c);
            }
        }
      }
      return true;  
    }
    private boolean ispal(String s,int i,int j)
    {
        while(i<j)
        {
        if(s.charAt(i)!=s.charAt(j))
        return false;
        i++;
        j--;
        }
        return true;

    }
}