class Solution {
    public int countCoveredBuildings(int n, int[][] buildings)
    {
       HashMap<Integer,ArrayList<Integer>> keys=new HashMap<>();
       HashMap<Integer,ArrayList<Integer>> values=new HashMap<>();
       int m=buildings.length;
       for(int i=0;i<m;i++)
       {
        int a=buildings[i][0];
        int b=buildings[i][1];
        keys.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
        values.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
       }
       for(ArrayList<Integer> list : keys.values())
       Collections.sort(list);
       for(ArrayList<Integer> list : values.values())
       Collections.sort(list);
       int cnt=0;
       for(int i=0;i<m;i++)
       {
          int a=buildings[i][0];
          int b=buildings[i][1];
          ArrayList<Integer> ys=keys.get(a);
          ArrayList<Integer> xs=values.get(b);
          int miny=ys.get(0);
          int maxy=ys.get(ys.size()-1);
          int minx=xs.get(0);
          int maxx=xs.get(xs.size()-1);
          if(b>miny && b<maxy && a>minx && a<maxx)
          cnt++;
       }

    //    for (int x : keys.keySet()) {
    //    System.out.println(x + " -> " + keys.get(x));
    //    }
    //    for (int x : values.keySet()) {
    //    System.out.println(x + " -> " + keys.get(x));
    //    }

       return cnt;
    }
}