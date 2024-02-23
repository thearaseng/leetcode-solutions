class Solution {
    public int romanToInt(String s) {

        String testStr = s;
        int length = testStr.length();
        int total = 0;
        int previous = 0;
        boolean isSubstract = false;

        for (int i = 0; i < length; i++) {
            
            char ch = testStr.charAt(i);
            int num = getInt(ch);
            boolean isLast = (i == (length - 1));

            isSubstract = ( !isLast && isSubstract(ch, testStr.charAt(i + 1)) );

            if (isSubstract) {
                previous = -1 * num;
            } else {
                total += previous + num;
                previous = 0;
            }

        }
        return total;
    }

    private int getInt(char ch) {
        switch (ch) {
            case 'I' :
                return 1;
            case 'V' :
                return 5;
            case 'X' :
                return 10;
            case 'L' :
                return 50;
            case 'C' :
                return 100;
            case 'D' :
                return 500;
            case 'M' :
                return 1000;
            default:
                return 0;
        }
    }

    private boolean isSubstract(char ch, char nextChar) {
        return (ch == 'I' && nextChar == 'V')
            || (ch == 'I' && nextChar == 'X')
            || (ch == 'X' && nextChar == 'L')
            || (ch == 'X' && nextChar == 'C')
            || (ch == 'C' && nextChar == 'D')
            || (ch == 'C' && nextChar == 'M');
    }

}