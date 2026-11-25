class Solution {
    public int maxLength(int[] nums)
    {
       int n=nums.length;
       int ans=0,product=1,len=0,max=0;
       for(int i=0;i<n;i++)
       {
        for(int j=i;j<n;j++)
        {
           len=j-i;
           ans=sample(nums,i,j);
           product=pro(nums,i,j);
           if(ans==product)
           {
            max=Math.max(max,len);
           }


        }
       }
       return max+1;
    }
    public static int sample(int[] nums,int a,int b)
    {
        int result1=0,result2=1;
        for(int i=a;i<=b;i++)
        {
            result1=gcd(result1,nums[i]);
            result2=lcm(result2,nums[i]);
        }
        return result1*result2;
    }
    public static int gcd(int a,int b)
    {
        while(b!=0)
        {
            int t=a%b;
            a=b;
            b=t;
        }
        return Math.abs(a);
    }
    public static int pro(int[] nums,int a,int b)
    {
        int p=1;
        for(int i=a;i<=b;i++)
        {
           p*=nums[i];
        }
        return p;
    }
    public static int lcm(int a,int b)
    {
        return (int)(a/gcd(a,b)*b);
    }
}