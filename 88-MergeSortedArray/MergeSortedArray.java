public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int a = m, b = n; a + b > 0;) {
            int current = a + b - 1;
            if (a == 0) {
                nums1[current] = nums2[b - 1];
                b--;
            } else if (b == 0  || nums1[a - 1] > nums2[b - 1]) {
                nums1[current] = nums1[a - 1];
                a--;
            } else if (nums1[a - 1] <= nums2[b - 1]) {
                nums1[current] = nums2[b - 1];
                b--;
            }
        }
    }
}
