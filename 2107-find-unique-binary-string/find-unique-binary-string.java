class Solution {
    public String findDifferentBinaryString(String[] nums) 
    {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            int a=Integer.parseInt(nums[i],2);
            set.add(a);
        }
        int b=0;
        for(int i=0;i<(1<<n);i++)
        {
           if(!set.contains(i))
           {
            b=i;
            break;
           }
        }
        String str=Integer.toString(b,2);
        String str2="";
        int c=str.length();
        n-=c;
        if(n==0)
        return str;
        while(n>0)
        {
           str2+='0';
           n--;
        }
        str2+=str;
        return str2;
        
    }
}