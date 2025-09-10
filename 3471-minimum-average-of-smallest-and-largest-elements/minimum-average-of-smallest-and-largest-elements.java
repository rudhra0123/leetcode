class Solution {
    public double minimumAverage(int[] nums)
    {
        double avg=0,min=Integer.MAX_VALUE;
        int n=nums.length;
        Mergesort(nums,0,n-1);
        for(int i=0;i<n/2;i++)
        {
            avg=(double)(nums[i]+nums[n-i-1])/2;
            min=Math.min(min,avg);
        }
        System.out.println(Arrays.toString(nums));
        return min;
    }
    public int[] Mergesort(int[] arr,int left,int right)
    {
        if(left<right)
        {
            int mid=(left+right)/2;
            Mergesort(arr,left,mid);
            Mergesort(arr,mid+1,right);
            Merge(arr,left,mid,right);
        }
        return arr;
    }
    public int[] Merge(int[] arr,int left,int mid,int right)
    {
        int n1=mid-left+1;
        int n2=right-mid;
        int[] l1=new int[n1];
        int[] r1=new int[n2];
        for(int i=0;i<n1;i++)
        l1[i]=arr[left+i];
        for(int i=0;i<n2;i++)
        r1[i]=arr[mid+i+1];
        int i=0,j=0,k=left;
        while(i<n1 && j<n2)
        {
            if(l1[i]<=r1[j])
            arr[k++]=l1[i++];
            else
            arr[k++]=r1[j++];
        }
        while(i<n1)
        arr[k++]=l1[i++];
        while(j<n2)
        arr[k++]=r1[j++];
        return arr;

    }
}