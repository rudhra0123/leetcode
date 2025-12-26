class Solution {
    public int bestClosingTime(String customers)
    {
        int lnt=customers.length();
        int min=Integer.MAX_VALUE;
        int cnt1=0,cnt2=0,k=0;
        int[][] arr=new int[lnt+1][2];
        for(int i=lnt-1;i>=0;i--)
        {
           arr[i+1][0]=cnt1;
           if(customers.charAt(i)=='Y')
           cnt1++;
        }
        arr[0][0]=cnt1;
        arr[0][1]=cnt2;
        for(int i=0;i<lnt;i++)
        {
            if(customers.charAt(i)=='N')
            cnt2++;
            arr[i+1][1]=cnt2;
        }
        for(int i=0;i<lnt+1;i++)
        {
            int sum=arr[i][0]+arr[i][1];
            if(min>sum)
            {
                min=sum;
                k=i;
            }
        }
        return k;
    }
}