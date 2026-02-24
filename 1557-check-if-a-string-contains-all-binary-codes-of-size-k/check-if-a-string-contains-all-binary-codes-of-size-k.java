class Solution {
    public boolean hasAllCodes(String s, int k)
    {
    int n = s.length();
    if (k > n) return false;   

    int total = 1 << k;       
    Set<String> set = new HashSet<>();
    int i=0,j=k;
       while(j<=n)
       {
         String str=s.substring(i,j);
         set.add(str);
         i++;
         j++;
        if(set.size() == total)
        return true;
       }
       return set.size() == total;
    }
}