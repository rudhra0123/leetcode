class Solution {
    public String digitSum(String s, int k)
    {
       int n=s.length();
       if(n<=k)
       {
         return s;
       }

       while(n>k)
       {
         StringBuilder sb=new StringBuilder();
         int i=0,a=0,b=k;
         while(i<s.length())
         {
            int sum=0;
            for(i=a;i<b && i<s.length();i++)
            {
               sum+=s.charAt(i)-'0';
            }
            sb.append(sum);
            a=b;
            b=b+k;
         }
         s=sb.toString();
         n=s.length();
       }

       return s;
    }
}