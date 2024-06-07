class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // move elements to the tail
        int num1Len = nums1.length;
        int i = m - 1;
        int k = num1Len - 1;
        while (i >= 0) {
            int val = nums1[i];
            nums1[k] = val;

            i--;
            k--;
        }

        k++;
        int totalLen = m + n;
        i = -1;
        int s = 0;
        while (i < totalLen - 1) {
            i++;     

            if (   k >=  totalLen || m == 0 ) {
                nums1[i] = nums2[s];
                s++;
                continue;
            }

            if ( s >= n || n == 0 ) {
                nums1[i] = nums1[k];
                k++;
                continue;
            }

            if (nums1[k] < nums2[s]) {
                nums1[i] = nums1[k];
                k++;
            } else {
                nums1[i] = nums2[s];
                s++;
            }

        }

    }
}