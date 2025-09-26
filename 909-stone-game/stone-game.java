class Solution {
    public boolean stoneGame(int[] piles)
    {
      int lnt=piles.length;
      int suma=0,sumb=0,i=0,j=lnt-1;
      while(i<j)
      {
        if(j-i==1)
        {
            suma+=Math.max(piles[i],piles[j]);
            sumb+=Math.min(piles[i],piles[j]);
            break;
        }
        else if(piles[i]+piles[j-1]>piles[j]+piles[i+1])
        {
            suma+=piles[i];
            sumb+=piles[j];
            i++;
            j--;
        }
        else if(piles[i]+piles[j-1]<piles[j]+piles[i+1])
        {
            suma+=piles[j];
            sumb+=piles[i];
            i++;
            j--;
        }
        else
        {
            suma+=Math.max(piles[i],piles[j]);
            sumb+=Math.max(piles[i],piles[j]);
            i++;
            j--;
        }
      }  
      return suma>sumb;
    }
}