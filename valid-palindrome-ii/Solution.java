class Solution {
    public boolean validPalindrome(String s) {
        int len = s.length();
        int left = 0;
        int right = len - 1;
        
        while (right >= left) {

            if (s.charAt(left) != s.charAt(right)) {
                break;
            }

            if (right - left < 2) {
                return true;
            }

            left++;
            right--;
        }

        left = 0;
        right = len - 1;
        
        for (int skippedIndex = 0; skippedIndex < len; skippedIndex++) {
            
            left = 0;
            right = len - 1;

            while (right >= left) {

                if (left == skippedIndex) left++;
                if (right == skippedIndex) right--;

                if (s.charAt(left) != s.charAt(right)) {
                    break;
                }

                if (right - left < 2) {
                    return true;
                }

                left++;
                right--;

            }
        }

        return false;
    }

}