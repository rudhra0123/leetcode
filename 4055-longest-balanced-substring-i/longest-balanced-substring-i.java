class Solution {
    public int longestBalanced(String s)
    {
        int n = s.length();
    int max = 0;

    for (int i = 0; i < n; i++)
    {
        int[] freq = new int[26];

        for (int j = i; j < n; j++)
        {
            freq[s.charAt(j) - 'a']++;

            if (isBalanced(freq)) {
                max = Math.max(max, j - i + 1);
            }
        }
    }
    return max;
}

private boolean isBalanced(int[] freq) {
    int val = 0;

    for (int f:freq)
    {
        if (f>0)
        {
            if (val==0) 
            val=f;
            else if
            (f!=val)
            return false;
        }
    }
    return true;
}
}