public class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
            int mid1 = (A.length + B.length + 1) >> 1;
            int mid2 = (A.length + B.length + 2) >> 1;
            return (findKth(A, 0, B, 0, mid1) + findKth(A, 0, B, 0, mid2)) / 2.0;
        }
        
        public int findKth(int[] A, int ABeg, int[] B, int BBeg, int k) {
            if (ABeg > A.length - 1) return B[BBeg + k - 1];
            if (BBeg > B.length - 1) return A[ABeg + k - 1];
            
            if (k == 1) return Math.min(A[ABeg], B[BBeg]);
            
            int AMid = Math.min(A.length - ABeg, k / 2);
            int BMid = Math.min(B.length - BBeg, k / 2);
            
            if (A[ABeg + AMid - 1] <= B[BBeg + BMid - 1]) {
                return findKth(A, ABeg + AMid, B, BBeg, k - AMid);
            } else {
                return findKth(A, ABeg, B, BBeg + BMid, k - BMid);
            }
        }
}
