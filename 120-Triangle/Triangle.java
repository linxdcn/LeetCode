public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }
        int rows = triangle.size();
        int[] store = new int[rows];
        int[] cal = new int[rows];
        store[0] = triangle.get(0).get(0);
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (j - 1 < 0) {
                    cal[j] = triangle.get(i).get(j) + store[0];
                } else if (j == triangle.get(i).size() - 1 ) {
                    cal[j] = triangle.get(i).get(j) + store[j - 1];
                } else {
                    cal[j] = triangle.get(i).get(j) + (store[j - 1] > store[j] ? store[j] : store[j - 1]);
                }
            }
            for (int j = 0; j < triangle.get(i).size(); j++) {
                store[j] = cal[j];
            }
        }
        int min = store[0];
        for (int i = 0; i < rows; i++) {
            if (min > store[i]) {
                min = store[i];
            }
        }
        return min;
    }
}`
