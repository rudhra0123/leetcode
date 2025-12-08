class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix)
    {
       int m=matrix.length;
       int n=matrix[0].length;
       int max1=0,max2=1;
       for(int i=0;i<m;i++)
       {
        int c1=0,c2=0;
        for(int j=0;j<n;j++)
        {
            if(matrix[i][j]==0)
            c1++;
            else
            c2++;
        }
        if(c1==n|| c2==n)
        max1++;
       }
       ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
       for(int i=0;i<m;i++)
       {
        int a=0;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        for(int j=1;j<n;j++)
        {
           if(matrix[i][j-1]!=matrix[i][j])
           {
           list.add(j);
           }
        }
        ans.add(list);
       }
       HashMap<ArrayList<Integer>,Integer> map=new HashMap<>();
       for(ArrayList<Integer> list:ans)
       {
          map.put(list,map.getOrDefault(list,0)+1);
       }
       for(Map.Entry<ArrayList<Integer>,Integer> entry:map.entrySet())
       {
        max2=Math.max(max2,entry.getValue());
       }
       
       int f=Math.max(max1,max2);
       return f;
    }
}