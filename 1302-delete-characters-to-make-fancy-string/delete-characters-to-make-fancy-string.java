class Solution {
    public String makeFancyString(String s)
    {
    StringBuilder str = new StringBuilder();
    int n = s.length();

    for (int i = 0; i < n; i++) {
        int len = str.length();
        if (len >= 2 && str.charAt(len - 1) == s.charAt(i) && str.charAt(len - 2) == s.charAt(i)) {
            continue; // skip adding the third repeated character
        }
        str.append(s.charAt(i));
    }

    return str.toString();


    }
}