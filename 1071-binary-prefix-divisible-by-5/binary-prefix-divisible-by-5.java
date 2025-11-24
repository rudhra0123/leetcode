import java.math.BigInteger;
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums)
    {
        List<Boolean> list=new ArrayList<>();
        int n=nums.length,r=0;
        for(int num:nums)
        {
          r=((r<<1)+num)%5;
          list.add(r==0); 
        }
        return list;
    }
}