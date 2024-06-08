class Solution {
    public void moveZeroes(int[] nums) {
        
        int nonZero = 0;
        for (int num : nums) {
            if (num != 0) {
                ++nonZero;
            }
        }

        int len = nums.length;
        int index = 0;
        int current = 0;
        for (int i = 0; i < len; i++) {

            current = nums[i];
            if (current != 0) {
                nums[index] = current;

                if (i >= nonZero) {
                    nums[i] = 0;
                }

                ++index;
            }
        }

    }
}