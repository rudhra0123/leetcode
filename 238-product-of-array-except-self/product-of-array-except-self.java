class Solution {
    public int[] productExceptSelf(int[] nums)
    {
        int n=nums.length;
        int[] left=new int[n];
        int[] right=new int[n];
        int[] ans=new int[n];
        int i=0,j=n-1;
        int a=1,b=1;
        while(i<n)
        {
            a*=nums[i];
            b*=nums[j];
            left[i]=a;
            right[j]=b;
            j--;
            i++;
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        for(int k=0;k<n;k++)
        {
           if(k==0)
           ans[k]=right[k+1];
           else if(k==n-1)
           ans[k]=left[k-1];
           else
           ans[k]=left[k-1]*right[k+1];

        }
        

        return ans;
    }
}