class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        
        String str = s;
        int len = queries.length;
        int[] result = new int[len];

        int start = 0, end = 0;
        int[] pair;

        for (int i = 0; i < len; i++) {

            if (!str.contains("|")) {
                result[i] = 0;
                break;
            }

            pair  = queries[i];
            start = pair[0];
            end   = pair[1];

            String substr = str.substring(start, end + 1);
            start = substr.indexOf("|");
            end   = substr.lastIndexOf("|");

            if (start == -1 || start >= end) {
                result[i] = 0;
                continue;
            }

            result[i] = (int) substr.substring(start, end + 1).chars().filter(ch -> ch == '*').count();
        }

        return result;
    }
}