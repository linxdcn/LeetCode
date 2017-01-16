public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m - 1;
        int b = n - 1;
        int current = m + n -1;
        while (a > -1 && b > -1) {
            if (nums1[a] < nums2[b]) {
                nums1[current--] = nums2[b--];
            } else {
                nums1[current--] = nums1[a--];
            }
        }
        while (b > -1) {
                nums1[current--] = nums2[b--];
            }
    }
}
