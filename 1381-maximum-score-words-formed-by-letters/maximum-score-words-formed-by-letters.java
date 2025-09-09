class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score)
    {
        List<Character> list=new ArrayList<>();
        for(char ch:letters)
        list.add(ch);
        // int max=0;
        // for(int i=0;i<words.length;i++)
        // {
        //    max=Math.max(max,helper(list,words[i],score));
        // }
        return helper2(list,words,score);
    }
    // public static int helper(List<Character> list,String s,int[] score)
    // {
    //     int sum=0,c=0;
    //     for(int i=0;i<s.length();i++)
    //     {
    //         char ch=s.charAt(i);
    //         if(list.contains(ch))
    //         {
    //             sum+=score[ch-'a'];
    //             System.out.println(ch);
    //             System.out.println(score[ch-'a']);
    //             list.remove(Character.valueOf(ch));
    //         }
    //         else
    //         {
    //         sum=0;
    //         return sum;
    //         }
    //     }
    //     return sum;
    // }
    public static int helper2(List<Character> list,String[] words,int[] score)
    {
        int lnt=words.length;
        int n=1<<lnt;
        boolean valid=true;
        int sum2=0,max=0;
        
        for(int i=0;i<n;i++)
        {
            ArrayList<String> list2=new ArrayList<>();
            for(int j=0;j<lnt;j++)
            {
                if((i&(1<<j))!=0)
                list2.add(words[j]);
            }
            sum2=0;
            List<Character> templist = new ArrayList<>(list);
            for(int k=0;k<list2.size();k++)
            {
               int sum=0;
               System.out.println(list2.get(k));
               for(int a=0;a<list2.get(k).length();a++)
               {
                char ch=list2.get(k).charAt(a);
                if(templist.contains(ch))
                {
                  sum+=score[ch-'a'];
                  templist.remove(Character.valueOf(ch));
                  valid=true;
                }
                else
                {
                    valid=false;
                    break;
                }
               }
               if(!valid) break;
               sum2+=sum;
               System.out.println(sum2);
            }
            if(valid)
            max=Math.max(max,sum2);

        }
        return max;
    }
}