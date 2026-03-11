class Solution {
    public int bitwiseComplement(int n)
    {
      String s=Integer.toString(n,2);
      int l=s.length();
      int a=(1<<l)-1;
      return n^a;  
    }
}