class Solution {
    public int numberOfBeams(String[] bank)
    {
     int beams=0,a=0;
     int l=bank.length;
     for(int i=0;i<l;i++)
     {
        int cnt=0;
        for(int j=0;j<bank[i].length();j++)
        {
            if(bank[i].charAt(j)=='1')
            {
               cnt++; 
            }
        }
        if(cnt!=0)
        {
            beams+=a*cnt;
            a=cnt;
        }
        
     }
     return beams; 
    }
}