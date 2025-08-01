class Solution {
    public List<Integer> getRow(int rowIndex)
    {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> s=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++)
        {
            ArrayList<Integer> ans=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                ans.add(1);
                // System.out.println("hi");
                else
                {
                    int val=list.get(i-1).get(j-1)+list.get(i-1).get(j);
                    ans.add(val);
                }
            
            }
            list.add(ans);   

        }
        return list.get(rowIndex);
        // return s;
    }
}