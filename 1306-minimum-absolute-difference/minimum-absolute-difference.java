class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr)
    {
      List<List<Integer>> ans=new ArrayList<>();
      Arrays.sort(arr);
      int min=Integer.MAX_VALUE;
      for(int i=0;i<arr.length-1;i++)
      {
        min=Math.min(Math.abs(arr[i]-arr[i+1]),min);
      }
      for(int i=0;i<arr.length-1;i++)
      {
        int d=Math.abs(arr[i]-arr[i+1]);
        List<Integer> list=new ArrayList<>();
        if(d==min)
        {
            list.add(arr[i]);
            list.add(arr[i+1]);
            ans.add(list);
        }
      }
      return ans;
    }
}