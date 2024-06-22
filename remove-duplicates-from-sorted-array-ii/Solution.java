class Solution {
    public int removeDuplicates(int[] nums) {

        int len = nums.length;

        if (len < 3) {
            return len;
        }

        int k = 0;
        int i = 0;
        int count = 1;
        int previous = nums[0];

        while (i < len - 1) {
            
            ++i;

            if (previous == nums[i]) {
                ++count;
            } else {
                count = 1;
                previous = nums[i];
            }

            if (count < 3) {
                nums[++k] = nums[i];
            }
        }

        return k + 1;
    }
}