class Solution {
    public int[] sumZero(int n)
    {
        int[] arr=new int[n];
        int k=1,j=0;
        for(int i=0;i<n/2;i++)
        {
            arr[j++]=k;
            arr[j++]=-k;
            k++;
        }
        return arr;
    }
}