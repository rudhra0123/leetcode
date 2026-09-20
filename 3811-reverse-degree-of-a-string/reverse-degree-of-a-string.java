class Solution {
    public int reverseDegree(String s)
    {
      int sum=0;
      for(int i=0;i<s.length();i++)
      {
        int ch=75-(s.charAt(i)-'0');
        sum+=(i+1)*ch;
      }
      return sum;  
    }
}