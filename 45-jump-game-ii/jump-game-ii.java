class Solution {
    public int jump(int[] nums) {
       int lnt=nums.length;
       int a=0,b=0,c=0,cnt=0;
    //    if(nums[0]==0)
    //    return 0;
       if(lnt==1)
       return 0;
       for(int i=0;i<lnt;i++)
       {
           a=i+1;
           b=i+nums[i];
           cnt++;
           if(b>=lnt-1)
           {
            System.out.println(cnt);
            break;
           }
           c=findmax(a,b,nums);
        //    if(nums[c]==0||c==0||nums[0]==0)
        //    return false;  
           i=c-1;
       }
       return cnt;
        
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