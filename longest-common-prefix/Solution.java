class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String firstElement = strs[0];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < firstElement.length(); i++) {
            
            char cha = firstElement.charAt(i);
            boolean found = true;

            for (int inner = 1; inner < strs.length; inner++) {
                String element = strs[inner];
                if (element.length() < (i + 1) || element.charAt(i) != cha ) {
                    found = false;
                    break;
                }
            }

            if (found) {
                result.append(cha);
            } else {
                break;
            }
        }

        return result.toString();
    }
}