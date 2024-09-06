class Solution {
    public int majorityElement(int[] nums) {
        
        int maxVal = Integer.MIN_VALUE;
        int result = 0;
        int val = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            val = map.getOrDefault(num, 0);
            
            if (val > maxVal) {
                maxVal = val;
                result = num;
            }

            map.put(num, val + 1);
        }

        return result;
    }
}