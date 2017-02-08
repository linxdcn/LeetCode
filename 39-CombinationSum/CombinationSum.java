public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> candidate = new ArrayList<Integer>();
        helper(candidates, result, candidate, target, 0);
        return result;
    }
    
    public void helper(int[] candidates, List<List<Integer>> result, List<Integer> candidate, int rest, int start) {
        if (rest < 0) return;
        if (rest == 0) result.add(new ArrayList<Integer>(candidate));
        for (int i = start; i < candidates.length; i++) {
            candidate.add(candidates[i]);
            helper(candidates, result, candidate, rest - candidates[i], i);
            candidate.remove(candidate.size() - 1);
        }
    }
}
