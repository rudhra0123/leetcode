class Solution {
    public String removeDigit(String number, char digit)
    {
        // List<String> list=new ArrayList<>();
        String str="";
        int n=number.length();
        for(int i=0;i<n;i++)
        {
            if(number.charAt(i)==digit)
            {
            String sb=number.substring(0,i)+number.substring(i+1);
            
            if(sb.compareTo(str)>0)
            str=sb;
            }
            
        }
        // for(int i=0;i<list.size();i++)
        // System.out.println(list.get(i));
        // Long max=Long.MIN_VALUE;
        // String str=list.get(0);
        // for(int i=1;i<list.size();i++)
        // {
        // //    str=str.compareTo(list.get(i));
        // }
        return str;
    }
}