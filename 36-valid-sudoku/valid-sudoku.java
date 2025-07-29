class Solution {
    public boolean isValidSudoku(char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            ArrayList<Character> list=new ArrayList<>();
            for(int j=0;j<9;j++)
            {
               if(Character.isDigit(board[i][j]))
               {
                if(!list.contains(board[i][j]))
                list.add(board[i][j]);
                else
                return false;
               }
            }
            list.clear();
            for(int j=0;j<9;j++)
            {
                if(Character.isDigit(board[j][i]))
                {
                if(!list.contains(board[j][i]))
                list.add(board[j][i]);
                else
                return false;
                }
            }
        }
        int a=0,b=3,c=0,d=3;
        Set<Character> set=new HashSet<>();
        ArrayList<Character> list=new ArrayList<>();
        while(c<9)
        {
        for(int i=a;i<b;i++)
        {
            for(int j=c;j<d;j++)
            {
               if(Character.isDigit(board[i][j]))
               {
                if(!list.contains(board[i][j]))
                list.add(board[i][j]);
                else
                return false;
               }
            }
        }
        list.clear();
        a+=3;
        b+=3;
        if(b>9)
        {
            a=0;
            b=3;
            c+=3;
            d+=3;
        }
        }
        return true;
    }
}