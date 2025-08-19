class Solution {
    public int maximum69Number(int num)
    {
        int sum=0,c=0;
        ArrayList<Integer> list=new ArrayList<>();
       while(num>0)
       {
        int r=num%10;
        list.add(r);
        num/=10;
       } 
       for(int i=list.size()-1;i>=0;i--)
       {
         if(c==0 && list.get(i)==6)
         {
         sum=sum*10+9;
         c=1;
         }
         else
         sum=sum*10+list.get(i);
       }

       return sum;
    }
}