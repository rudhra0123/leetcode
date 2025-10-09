class Solution {
    public int scoreOfString(String s)
    {
        int sum=0;
      for(int i=0;i<s.length()-1;i++)
      {
        int val1=s.charAt(i)-'0';
        int val2=s.charAt(i+1)-'0';
        sum+=Math.abs(val1-val2);
      }  
      return sum;
    }
}