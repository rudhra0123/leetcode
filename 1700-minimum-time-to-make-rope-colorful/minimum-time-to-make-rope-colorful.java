class Solution {
    public int minCost(String colors, int[] neededTime)
    {
        int lnt=neededTime.length;
        ArrayList<Integer> list=new ArrayList<>();
       int cnt=0;
        for(int i=0;i<lnt-1;i++)
        {
            if(colors.charAt(i)==colors.charAt(i+1))
            {
               list.add(neededTime[i]);
               if(i==lnt-2)
               list.add(neededTime[i+1]);
            }
            else
            {
                if(list.size()>0)
                {
                list.add(neededTime[i]);
                Collections.sort(list);
                for(int j=0;j<list.size()-1;j++)
                {
                    cnt+=list.get(j);
                    System.out.println(list.get(j));
                }
                list.clear();
                }
            }
        }
         if(list.size()>0)
                {
                // list.add(neededTime[i]);
                Collections.sort(list);
                for(int j=0;j<list.size()-1;j++)
                {
                    cnt+=list.get(j);
                    System.out.println(list.get(j));
                }
                list.clear();
                }
        return cnt;
    }
}