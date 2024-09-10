class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        StringBuilder result = new StringBuilder();
        int len = s.length();
        char ch = ' ';
        for (int i = s.length() - 1; i > -1; i--) {
            
            ch = s.charAt(i);
            if (ch == ' ') {
                return result.length();
            }

            result.append(ch);

        }

        return result.length() == len ? len : 0;
    }
}