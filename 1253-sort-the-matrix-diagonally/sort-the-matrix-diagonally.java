class Solution {
    public int[][] diagonalSort(int[][] mat)
    {
        int m=mat.length;
        int n=mat[0].length;
        int[][] an=new int[m][n];
        HashMap <Integer,ArrayList<Integer>> map =new HashMap<>();
        for(int i=0;i<m;i++)
        {
           for(int j=0;j<n;j++)
           {
              int d=i-j;
              if(map.containsKey(d))
              {
                ArrayList<Integer> ans=map.get(d);
                ans.add(mat[i][j]);
                Collections.sort(ans);
                map.put(d,ans);
              }
              else
              {
                ArrayList<Integer> ans=new ArrayList<>();
                ans.add(mat[i][j]);
                Collections.sort(ans);
                map.put(d,ans);
              }
           }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int d=i-j;
                ArrayList<Integer> ans=map.get(d);
                an[i][j]=ans.get(0);
                ans.remove(0);
                map.put(d,ans);
            }
        }
        return an;
    }
}