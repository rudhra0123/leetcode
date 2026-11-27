class Solution {
    public int[] kWeakestRows(int[][] mat, int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[k];
        for(int i=0;i<mat.length;i++)
        {
            int cnt=0;
            for(int j=0;j<mat[0].length;j++)
            {
               if(mat[i][j]==1)
               cnt++;
            }
            map.put(i,cnt);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->
        {
            if(!a.getValue().equals(b.getValue()))
            return a.getValue()-b.getValue();
            return a.getKey()-b.getKey();
        });
        int a=0;
        for(Map.Entry<Integer,Integer> entry:list)
        {
           if(k>0)
           {
            ans[a]=entry.getKey();
            a++;
            k--;
           }
        }
        return ans;
    }
}