class Solution {
    public boolean canJump(int[] nums) 
    {
       int lnt=nums.length;
       int a=0,b=0,c=0;
       for(int i=0;i<lnt;i++)
       {
           a=i+1;
           b=i+nums[i];
           if(b>=lnt-1)
           {
            return true;
           }
           c=findmax(a,b,nums);
           if(nums[c]==0||c==0||nums[0]==0)
           return false;
           i=c-1;
        //    System.out.println("a"+a+" "+"b"+b+" "+"c"+c);
       }
       return false;
        
    }
    public int findmax(int a,int b,int[] nums)
    {
        int max=0;
        int c=0;
        b=Math.min(b,nums.length-1);
        for(int i=a;i<=b;i++)
        {
            if(max<i+nums[i])
            {
                max=i+nums[i];
                c=i;
            }
        }
        return c;
    }
}