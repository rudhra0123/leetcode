class Solution {
    public int maxArea(int[] height)
    {
        int n=height.length;
        int i=0,j=n-1,max=Integer.MIN_VALUE;
        while(i!=j)
        {
          int s=Math.min(height[i],height[j]);
          if(max<(s*(j-i)))
          max=s*(j-i);
          if(height[i]<height[j])
          {
            i++;
          }
          else
          {
            j--;
          }

        }
        return max;
        
        
    }
}