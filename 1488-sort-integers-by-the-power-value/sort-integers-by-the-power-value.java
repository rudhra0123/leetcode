class Solution {
    public int getKth(int lo, int hi, int k)
    {
       int[] arr=new int[hi-lo+1];
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=lo;i<=hi;i++)
       {
          int a=power(i);
          map.put(i,a);
       } 
       List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
       list.sort((a,b)->
       {
        if(a.getValue().equals(b.getValue()))
        return a.getKey().compareTo(b.getKey());
        else
        return a.getValue().compareTo(b.getValue());
       }
       );
    //    for(int i=0;i<list.size();i++)
    //    {
    //     System.out.println(list.get(i).getValue());
    //    }

       return list.get(k-1).getKey();
    }
    public static int power(int n)
    {
        int c=0;
        if(n<=1)
        return c;
        while(n!=1)
        {
            if(n%2==0)
            n=n/2;
            else
            n=3*n+1;
            c++;
        }
        return c;
    }
}