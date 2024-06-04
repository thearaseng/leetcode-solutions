class Solution {
    public String addStrings(String num1, String num2) {
        
        int next = 0;
        int len1 = num1.length();
        int len2 = num2.length();
        int len = Math.max(len1, len2);
        int n1 = 0;
        int n2 = 0;
        long innerSum = 0;

        String result = "";

        for (int i = 0; i < len; i++) {

            n1 = (i >= len1) ? 0 : num1.charAt(len1 - i - 1) - '0';
            n2 = (i >= len2) ? 0 : num2.charAt(len2 - i - 1) - '0';

            innerSum = n1 + n2 + next;

            if (innerSum >= 10) {
                next = 1;
                innerSum = innerSum - 10;
            } else {
                next = 0;
            }

            result = innerSum + result;

        }

        if (next == 1) {
            result = "1" + result;
        }

        return result + "";
    }
}