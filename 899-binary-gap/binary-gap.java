class Solution {
    public int binaryGap(int n)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int c=0,max=0,num=0,prev=0;
        while(n!=0)
        {
          c++;
          if((n&1)>0)
          {
            num=prev;
            prev=c;
            if(prev-num>max && num!=0)
            max=prev-num;
          }
          n=n>>1;
        }
        return max;
        
    }
}