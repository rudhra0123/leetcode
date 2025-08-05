class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets)
    { 
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:baskets)
        list.add(num);
        int cnt=0;
        for(int j=0;j<fruits.length;j++)
        {
            boolean a=true;
            for(int i=0;i<list.size();i++)
            {
                if(fruits[j]<=list.get(i))
                {
                    list.remove(Integer.valueOf(list.get(i)));
                    a=false;
                    break;
                }
                
            }
            // if(a)
            // {
            // for(int i=0;i<list.size();i++)
            // {
            //     if(fruits[j]==list.get(i))
            //     {
            //     list.remove(Integer.valueOf(list.get(i)));
            //     // break;
            //     }
            // }
            // }
        }
        return list.size();
    }
}