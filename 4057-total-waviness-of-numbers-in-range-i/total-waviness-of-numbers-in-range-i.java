class Solution {
    public int totalWaviness(int num1, int num2)
    {
      int waviness=0;
      for(int i=num1;i<=num2;i++)
      {
        ArrayList<Integer> list=new ArrayList<>();
        int temp=i;
         while(temp>0)
         {
            int r=temp%10;
            list.add(r);
            temp/=10;
         }
         if(list.size()>2)
         {
            for(int j=1;j<list.size()-1;j++)
            {
               if(((list.get(j)>list.get(j-1))&&(list.get(j)>list.get(j+1))))
               waviness++;
               if(((list.get(j)<list.get(j-1))&&(list.get(j+1)>list.get(j))))
               waviness++;

            }
         }
      }  
         return waviness;

    }
}