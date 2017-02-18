public class Solution {
    public boolean search(int[] A, int target) {
            if (A == null || A.length == 0) return false;
            
            int beg = 0;
            int end = A.length - 1;
        
            while (beg <= end) {
                int mid = (beg + end) >> 1;
                if (A[mid] == target) return true;
                
                if (beg != end && A[beg] == A[mid] && A[beg] == A[end]) {
                    end = end - 1;
                    continue;
                }
                
                if (A[beg] <= A[mid]) {
                    if (target >= A[beg] && target <= A[mid]) end = mid - 1;
                    else beg = mid + 1;
                } else if (A[beg] > A[mid]) {
                    if (target >= A[mid] && target <= A[end]) beg = mid + 1;
                    else end = mid - 1;
                }
            }
            return false;
        }
}
