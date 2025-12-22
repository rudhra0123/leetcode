class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
       ArrayList<Integer> ans=new ArrayList<>();
       int n=nums.length;
       int[] arr=new int[n+1];
       for(int i=0;i<n;i++)
       {
        arr[nums[i]]++;
        if(arr[nums[i]]==2)
        ans.add(nums[i]);
       } 
       return ans;

    }
}