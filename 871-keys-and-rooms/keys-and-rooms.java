class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) 
    {
       int n=rooms.size();
       ArrayList<Integer> list=new ArrayList<>();
       for(int i=0;i<rooms.get(0).size();i++)
       list.add(rooms.get(0).get(i));
       if(!list.contains(0))
       list.add(0);
        for(int i=0;i<list.size();i++)
        {
            int d=list.get(i);
        for(int j=0;j<rooms.get(d).size();j++)
        {
            int c=rooms.get(d).get(j);
           if(!list.contains(c))
           {
            list.add(c);
           }
        }
        }
       if(list.size()!=n)
       return false;
       return true;

    }
}