class Solution {
    public int[] numberOfPairs(int[] nums)
    {
      int n=nums.length;
      int[] ans=new int[2];
      ArrayList<Integer> list=new ArrayList<>();
      for(int num:nums)
      list.add(num);
      int c=0;
      boolean b=true;
      while(b)
      {
        if(list.size()==0)
        break;
        for(int i=0;i<list.size();i++)
        {
            boolean a=true;
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i)==list.get(j))
                {
                    c++;
                    list.remove(j);
                    list.remove(i);
                    a=false;
                    break;
                }
            }
            if(i==list.size()-1)
            b=false;
            if(!a)
            break;
        }
      } 
      ans[0]=c;
      ans[1]=list.size();
      return ans; 
    }
}