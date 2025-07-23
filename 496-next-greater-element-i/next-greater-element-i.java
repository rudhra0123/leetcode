class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2)
    {
        int[] result=new int[nums1.length];
    for(int i=0;i<nums1.length;i++)
        {
            int ans=0,index=nums2.length;
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                 index=j;
                }
                if(j>index)
                {
                   if(nums2[j]>nums1[i])
                   {
                    ans=nums2[j];
                    break;
                   }
                }
             }
            System.out.println(ans);
            result[i]=(ans==0)?-1:ans;
        }
        return result;
      
    }
}