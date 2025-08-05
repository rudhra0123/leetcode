class Solution {
    public int totalFruit(int[] fruits)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
      
        int left=0,cnt=0;
        for(int i=0;i<fruits.length;i++)
        {
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            while(map.size()>2)
            {
              int a=fruits[left];
              map.put(a,map.get(a)-1);
              if(map.get(a)==0)
              map.remove(a);
            left++;
            }
        cnt=Math.max(cnt,(i-left+1));
        }
        
        return cnt;
        
    }
}