class Solution {
    public int[] findXSum(int[] nums, int k, int x)
    {
        int n=nums.length;
        int[] ans=new int[n-k+1];
        int a1=0,b1=k;
        while(b1<=n)
        {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=a1;i<b1;i++)
        {
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
         
         ArrayList<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
         Collections.sort(list,(a,b)->
         {
            if(!a.getValue().equals(b.getValue()))
            return (b.getValue())-a.getValue();
            else
            return b.getKey()-a.getKey();
         });
         int k1=0,sum=0;
         for(Map.Entry<Integer,Integer> e:list)
         {
            // System.out.println(e.getKey());
         if(k1<x)
         {
         sum+=e.getKey()*e.getValue();
         }
         k1++;
         }
         ans[a1]=sum;
         a1++;
         b1++;


        }
        return ans;
    }

}