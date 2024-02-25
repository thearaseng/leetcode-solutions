class Solution {
    public int[] plusOne(int[] digits) {

        int length = digits.length;
        int[] result = new int[length];
        int add = 1;
        for (int i = length - 1; i > -1; i--) {

            int num = digits[i] + add;
            
            if (num > 9) {
                num -= 10;
                add = 1;
            } else {
                add = 0;
            }

            result[i] = num;

        }

        // insert value to the first element and ship the rest elements to the right
        if (add > 0) {
            int[] newResult = new int[length + 1];

            newResult[0] = add;

            for (int i = 0; i < length; i++) {
                newResult[i + 1] = result[i];
            }

            result = newResult;
        }

        return result;

    }
}