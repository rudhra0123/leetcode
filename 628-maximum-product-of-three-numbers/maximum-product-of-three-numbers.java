class Solution {
    public int maximumProduct(int[] nums)
    {
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++)
       {
        int r=nums[i];
        if(r>max1)
        {
            max3=max2;
            max2=max1;
            max1=r;          
        }
        else if(r<max1 && r>max2)
        {
           max3=max2;
           max2=r; 
        }
        else if(r==max1)
        {
            max3=max2;
            max2=max1;
        }
        else if(r<max1 && r<max2 && r>max3)
        {
            max3=r;
        }
        else if(r==max2)
        {
            max3=max2;
        }


        if(r<min1)
        {
            min2=min1;
            min1=r;
        }
        else if(r>min1 && r<min2)
        {
            min2=r;
        }
        else if(r==min1)
        {
            min2=r;
        }
        System.out.println("max1"+max1+" "+"max2"+max2+" "+"max3"+max3);
       } 
       return Math.max(max1*max2*max3,min1*min2*max1);
    }
}