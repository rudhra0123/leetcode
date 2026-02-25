class Solution {
    public int[] sortByBits(int[] arr)
    {
        int n=arr.length;
        int[] bitset =new int[n];
        Integer[] result=new Integer[n];
        for(int i=0;i<n;i++)
        {
            bitset[i]=Integer.bitCount(arr[i]);
            result[i] = i; 
        }
        Arrays.sort(result,(i,j)->
        {
            int d=bitset[i]-bitset[j];
            return d!=0?d:arr[i]-arr[j];
        });
        int[] out=new int[n];
        for(int i=0;i<n;i++)
        {
            out[i]=arr[result[i]];
        }
        return out;
        
    }
}