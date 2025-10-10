class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
       int lnt=candies.length;
       int max=0;
       List<Boolean> list=new ArrayList<>();
       for(int num:candies)
       {
        max=Math.max(max,num);
       } 
       for(int i=0;i<lnt;i++)
       {
          if((candies[i]+extraCandies)>=max)
          list.add(true);
          else
          list.add(false);
       }
       return list;
    }
}