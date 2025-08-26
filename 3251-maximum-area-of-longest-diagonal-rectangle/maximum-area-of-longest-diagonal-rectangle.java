class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions)
    {
      int area=0;
      double max=0;
       for(int i=0;i<dimensions.length;i++)
       {
           double l=Math.sqrt(dimensions[i][0]*dimensions[i][0]+dimensions[i][1]*dimensions[i][1]);
           int a=dimensions[i][0]*dimensions[i][1];
           if(l>max ||(l==max && a>area))
           {
            max=l;
            area=a;
           }
       } 
       return area;
    }
}