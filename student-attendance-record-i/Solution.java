class Solution {
    public boolean checkRecord(String s) {
        
        int absentCount = 0, conLateCount = 0, len = s.length();
        char ch;

        for (int i = 0; i < len; i++) {
            ch = s.charAt(i);

            if (ch == 'A') {
                ++absentCount;
                conLateCount = 0;
            } else if (ch == 'L') {
                ++conLateCount;
            } else {
                conLateCount = 0;
            }

            if (absentCount > 1 || conLateCount >= 3) {
                return false;
            }

        }

        return true;
    }
}