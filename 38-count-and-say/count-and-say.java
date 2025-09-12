class Solution {
    public String countAndSay(int n)
    {
        
        String s="1";
        for(int i=1;i<n;i++)
        {
            s=sample(s);
        } 
        return s;
    }
    public String sample(String s)
    {
        StringBuilder sb=new StringBuilder();
        int cnt=1;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                cnt++;
            }
            else
            {
                sb.append(cnt).append(s.charAt(i));
                cnt=1;
            }
        }
        sb.append(cnt).append(s.charAt(s.length()-1));
        return sb.toString();
    }
}