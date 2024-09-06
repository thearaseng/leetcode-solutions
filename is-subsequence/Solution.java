class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if (s.length() == 0) {
            return true;
        }

        int len = t.length();
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = t.charAt(i);
            if (ch == s.charAt(index)) {
                index++;
            }

            if (index == s.length()) {
                return true;
            }
        }

        return false;
    }
}