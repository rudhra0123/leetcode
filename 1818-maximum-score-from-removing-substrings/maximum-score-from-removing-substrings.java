class Solution {
    public int maximumGain(String s,int x,int y)
    {
        int cnt1=0,cnt2=0,score=0;
        ArrayList<Integer> list=new ArrayList<>();
        String str1,str2;
        if(x>y)
        {
            str1="ab";
            str2="ba";
            cnt1=x;
            cnt2=y;
        }
        else
        {
            str1="ba";
            str2="ab";
            cnt1=y;
            cnt2=x;
        }
        while(s.contains(str1)||s.contains(str2))
        {
        if(s.contains(str1))
        s=string_1(s,str1,list,cnt1);
        else
        s=string_1(s,str2,list,cnt2);
        }
        int sum=0;
        for(int num:list)
        sum+=num;
        return sum;



        
    }

    public String string_1(String s,String str,ArrayList<Integer> list,int cnt)
    {
        Stack<Character> stack=new Stack();
        for(char ch:s.toCharArray())
        {
            Character first=str.charAt(0);
            Character second=str.charAt(1);
        if(!stack.isEmpty() && stack.peek()==first && ch==second)
        {
        list.add(cnt);
        stack.pop();
        }
        else
        stack.push(ch);
        }
        StringBuilder result=new StringBuilder();
        for(char ch:stack)
        {
            result.append(ch);
        }
        return result.toString();
    }


    // public String string_2(String s,String str,ArraYList<Integer> list,int cnt2)
    // {
    //     Stack<Character> stack=new stack();
    //     for(char ch=s.toCharArray())
    //     {
    //         Character first=str.charAt(0);
    //         Character second=str.charAt(1);
    //     if(!stack.isEmpty() && stack.peek()=='first' && ch=='second')
    //     {
    //     stack.pop();
    //     list.add(cnt2);
    //     }
    //     else
    //     stack.push(ch);
    //     }
    //     StringBuilder result=new StringBuilder();
    //     for(char ch:stack)
    //     {
    //         result.append(ch);
    //     }
    //     return result.toString();
    // }
}


