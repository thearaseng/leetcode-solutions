class Solution {
    public int findSpecialInteger(int[] arr) {
        
        int len = arr.length;
        int target = 25 * len / 100;
        ++target;

        int previous = arr[0];
        int count = 1;
        for (int i = 1; i < len; i++) {
            
            if (previous == arr[i]) {
                ++count;
            } else {
                count = 1;
            }

            if (count >= target) {
                return previous;
            }

            previous = arr[i];
        }

        return previous;
    }
}