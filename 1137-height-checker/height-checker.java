class Solution {
    public int heightChecker(int[] heights)
    {
      int l=heights.length;
      int[] arr=new int[l];
      for(int i=0;i<l;i++)
      arr[i]=heights[i];
      int cnt=0;
      Arrays.sort(heights);
      for(int i=0;i<l;i++)
      {
        if(arr[i]==heights[i])
        cnt++;
      } 
      return l-cnt; 
    }
}