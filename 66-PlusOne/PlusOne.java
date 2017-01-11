public class Solution {
    public int[] plusOne(int[] digits) {
        int count = digits.length;
        for (int i = count - 1; i > -1; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        int[] newDigits = new int[count + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
