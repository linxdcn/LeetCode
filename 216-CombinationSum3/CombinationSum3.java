public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (k <= 0 || k > 9 || n <= 0 || n > 45) {
            return result;
        }
        List<Integer> item = new LinkedList<Integer>();
        serach(result, item, k, n, 1);
        return result;
    }
    
    public void serach(List<List<Integer>> result, List<Integer> item, int k, int n, int start) {
        if (item.size() == k && n == 0) {
            result.add(new LinkedList<Integer>(item));
        }
        if (item.size() > k) {
            return;
        }
        for (int i = start; i <= 9; i++) {
            item.add(i);
            serach(result, item, k, n - i, i + 1);
            item.remove(item.size() - 1);
        }
    }
}
