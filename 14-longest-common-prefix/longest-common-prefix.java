class Solution {
    public String longestCommonPrefix(String[] strs)
    {
      
         String s="";
         if(strs.length==1)
         return strs[0];
         System.out.println(strs.length);
         int j=0;
         boolean a=true;
         int min=Integer.MAX_VALUE;
         for(int i=0;i<strs.length;i++)
         {
            min=Math.min(min,strs[i].length());
         }
         while(min>0)
         {
         for(int i=0;i<strs.length-1;i++)
         {
             if(strs[i].charAt(j)==strs[i+1].charAt(j))
               {
                a=true;
               }
               else
               {
                a=false;
                break;
               } 
         } 
         if(a)
         {
            s+=strs[0].charAt(j);
         }
         else
         {
            break;
         }
         j++;
         min--;
         }
         return s;
    }
}