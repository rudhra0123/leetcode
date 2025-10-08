class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success)
    {
       int n=spells.length;
       int m=potions.length;
       int[] ans=new int[n];
       Arrays.sort(potions);
       for(int i=0;i<n;i++)
       {
        ans[i]=binarysearch(potions,success,spells[i]);
       } 
       return ans;
    }
    public int binarysearch(int[] potions,long success,int x)
    {
       int low=0,high=potions.length-1,ans=potions.length;
       while(low<=high)
       {
         int mid=low+(high-low)/2;
         if(((long)potions[mid]*x)>=success)
         {
         high=mid-1;
         ans=mid;
         }
         else
         low=mid+1;

       }
       return potions.length-ans;
    }
}