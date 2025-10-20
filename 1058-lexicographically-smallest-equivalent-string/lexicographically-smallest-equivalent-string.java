class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr)
    {
        ArrayList<ArrayList<Character>> ans=new ArrayList<>();
        int n=s1.length();
        for(int i=0;i<n;i++)
        {
            char a=s1.charAt(i);
            char b=s2.charAt(i);
            int ind1=-1,ind2=-1;
            for(int j=0;j<ans.size();j++)
            {
                if(ans.get(j).contains(a)) ind1=j;
                if(ans.get(j).contains(b)) ind2=j;   
            }
            if(ind1==-1 && ind2==-1)
            {
                ArrayList<Character> list=new ArrayList<>();
                list.add(a);
                list.add(b);
                Collections.sort(list);
                ans.add(list);
            }
            else if(ind1!=-1 && ind2==-1)
            {
                if(!ans.get(ind1).contains(b))
                {
                    ans.get(ind1).add(b);
                    Collections.sort(ans.get(ind1));
                }
            }
            else if(ind1==-1 && ind2!=-1)
            {
                if(!ans.get(ind2).contains(a))
                {
                    ans.get(ind2).add(a);
                    Collections.sort(ans.get(ind2));
                }
            }
            else if(ind1!=ind2)
            {
               ans.get(ind1).addAll(ans.get(ind2));
               Collections.sort(ans.get(ind1));
               ans.remove(ind2);
            }
        }


        for (ArrayList<Character> inner : ans) {
    System.out.println(inner);
}



        String s="";
        
           for(int k=0;k<baseStr.length();k++)
           {
            int c=0;
            for(int i=0;i<ans.size();i++)
            {
                if(ans.get(i).contains(baseStr.charAt(k)))
                {
                    s+=ans.get(i).get(0);
                    c=1;
                    break;
                }
            }
            if(c==0)
            s+=baseStr.charAt(k);
           }
        return s;
    }
}