class Solution 
{
    public int maxRepeating(String sequence, String word)
    {       
        int cnt=0;
        StringBuilder sb=new StringBuilder(word);
        while(sequence.contains(sb.toString()))
        {
        cnt++;
        sb.append(word);
        }
       return cnt;
    }
}