class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums)
    {
       Stack<Integer> stack=new Stack<>();
        for(int num:nums)
        {
            int cur=num;
            while(!stack.isEmpty())
            {
                int top=stack.peek();
                int gcd=gcd(top,cur);
                if(gcd>1)
                {
                    stack.pop();
                    cur=(int)((1L*cur*top)/gcd);
                }
                else
                {
                    break;
                }
            }
            stack.push(cur);
        }
        
       return new ArrayList<>(stack);
    }
    public int gcd(int x,int y)
    {
        if(y==0)
        return x;
        else
        return gcd(y,x%y);
    }
}