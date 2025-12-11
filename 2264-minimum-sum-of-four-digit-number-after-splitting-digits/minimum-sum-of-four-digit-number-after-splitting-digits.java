class Solution {
    public int minimumSum(int num) 
    {
      ArrayList<Integer> list=new ArrayList<>();
      while(num>0)
      {
        int r=num%10;
        list.add(r);
        num/=10;
      } 
      Collections.sort(list);
      int ans=0;
      ans=list.get(0)*10+list.get(3);
      ans+=list.get(1)*10+list.get(2);
      return ans;

    }
}