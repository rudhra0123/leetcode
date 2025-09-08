class Solution {
    public int[] getNoZeroIntegers(int n)
    {
        int[] arr=new int[2];
        int a=0,b=0,k=0;
        for(int i=1;i<n;i++)
        {
            a=i;
            b=n-i;
            String s1=Integer.toString(a);
            String s2=Integer.toString(b);
            if(!s1.contains("0")  && !s2.contains("0"))
            {
            arr[k++]=a;
            arr[k]=b;
            break;
            }
        }
        return arr;
    }
}