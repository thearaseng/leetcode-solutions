class Solution {
    public int maxProfit(int[] prices) {
        
        int len = prices.length;
        int max = 0;
        for (int i = 0; i < len - 1; i++) {

            int a = prices[i];
            
            for (int innerI = i + 1; innerI < len; innerI++) {
                int b = prices[innerI];
                int value = b - a;
                max = value > max ? value : max;
            }

        }

        return max;
    }
}