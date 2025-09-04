class Solution {
    public int maximumGap(int[] nums)
    {
        int lnt=nums.length;
        mergesort(nums,0,lnt-1);
        System.out.println(Arrays.toString(nums));
        int max=0;
        for(int i=0;i<lnt-1;i++)
        {
            max=Math.max(max,nums[i+1]-nums[i]);
        }
        return max;

    }
    public int[] mergesort(int[] arr,int left,int right)
    {
        if(left<right)
        {
            int mid=(left+right)/2;
            mergesort(arr,left,mid);
            mergesort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
        return arr;
    }
    public void merge(int[] arr,int left,int mid,int right)
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
    }
}