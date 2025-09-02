class Solution {
    public int[] shuffle(int[] nums, int n)
    {
       int lnt=nums.length;
       int[] arr=new int[lnt];
       int i=0,j=n,k=0;
       while(i<lnt && j<lnt)
       {
           arr[k++]=nums[i];
           i++;
           arr[k++]=nums[j];
           j++;
       }
       return arr;
    }
}