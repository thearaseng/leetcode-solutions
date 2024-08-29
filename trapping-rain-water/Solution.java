class Solution {
    public int trap(int[] height) {
        
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0, rightMax = 0, trappedWater = 0;


        while (left < right) {

            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if (height[left] < height[right]) {
                trappedWater += (leftMax - height[left]);
                left++;
            } else {
                trappedWater += (rightMax - height[right]);
                right--;
            }

        }

        return trappedWater;
    }
}