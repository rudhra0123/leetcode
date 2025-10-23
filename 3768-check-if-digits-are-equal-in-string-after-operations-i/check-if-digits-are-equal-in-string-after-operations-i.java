class Solution {
    public boolean hasSameDigits(String s)
    {
        if(s.length()==2)
        {
           if(s.charAt(0)==s.charAt(1))
           return true;
           else
           return false;
        }
        int l=s.length();
        String s1="";
        int i=0;
        while(i<s.length()-1)
        {
        int a=s.charAt(i)-'0';
        int b=s.charAt(i+1)-'0';
        s1+=Integer.toString((a+b)%10);
        System.out.println(s1);
        i++;
        }
        return hasSameDigits(s1); 
    
    }
}