class Solution {
    public int totalHammingDistance(int[] nums)
    {
     int[] arr=new int[32];
     int cnt=0,n=nums.length;
     for(int i=0;i<32;i++)
     {
        int count1=0;
        for(int j=0;j<nums.length;j++)
        {
            if((nums[j]&(1<<i))>0)
            {
             count1++;
            }
        }
        // System.out.println(count1);
        int count0=n-count1;
        // System.out.println(" "+count0+" ");
        cnt+=count0*count1;
     }
     return cnt;
        
    }
}