class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int len = nums.length;
        int endIndex = len - k + 1;
        int currentSum = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;

        for (int i = 1; i < endIndex; i++) {
            currentSum = sum - nums[i - 1] + nums[i + k - 1];
            max = currentSum > max ? currentSum : max;
            sum = currentSum;
        }
        
        return Double.valueOf(max) / Double.valueOf(k);
    }
}