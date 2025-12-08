class Solution {
    public int countTriples(int n)
    {
        int cnt=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++)
        list.add(i*i);
        for(int i=1;i<=n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                int ans=i*i+j*j;
                if(list.contains(ans))
                cnt++;
            }
        }
        return cnt*2;
    }
}