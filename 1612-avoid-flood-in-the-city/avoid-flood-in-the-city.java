class Solution 
{
    public int[] avoidFlood(int[] rains) 
    {
         int lnt=rains.length;
         HashMap<Integer,Integer> map=new HashMap<>();
         int[] ans=new int[lnt];
         ArrayList<Integer> list=new ArrayList<>();
         for(int i=0;i<lnt;i++)
         {
            if(!map.containsKey(rains[i]) && rains[i]!=0)
            {
                ans[i]=-1;
                map.put(rains[i],i);
            }
            else if(rains[i]==0)
            {
                list.add(i);
                ans[i]=1;
            }
            else
            {
                int prev=map.get(rains[i]);
                boolean dry=false;
                for(int j=0;j<list.size();j++)
                {
                    if(list.get(j)>prev)
                    {
                        ans[list.get(j)]=rains[i];
                        list.remove(j);
                        dry=true;
                        break;
                    }
                }
                if(!dry)
                return new int[0];
                ans[i]=-1;
                map.put(rains[i],i);
            }
         } 
         return ans;  
    }
}