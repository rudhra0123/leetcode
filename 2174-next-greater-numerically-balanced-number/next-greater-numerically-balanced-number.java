class Solution {
    public int nextBeautifulNumber(int n)
    {
       n++;
       int a=0;
       while(true)
       {
         HashMap<Integer,Integer> map=new HashMap<>();
         int t=n;
         while(t>0)
         {
            int r=t%10;
            map.put(r,map.getOrDefault(r,0)+1);
            t/=10;
         }
         int cnt=0;
         for(Map.Entry<Integer,Integer> entry:map.entrySet())
         {
            if(entry.getKey()==entry.getValue())
            {
              cnt++;
            }
         }
         if(cnt==map.size())
         {
            // System.out.println("hi");
            break;
         }
         n++;
         
       } 
       return n;
    }
}