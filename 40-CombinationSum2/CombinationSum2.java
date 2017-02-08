public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> candidate = new ArrayList<Integer>();
        Arrays.sort(candidates);
        helper(candidates, result, candidate, target, 0);
        return result;
    }
    
    public void helper(int[] candidates, List<List<Integer>> result, List<Integer> candidate, int rest, int start) {
        if (rest < 0) return;
        if (rest == 0) result.add(new ArrayList<Integer>(candidate));
        for (int i = start; i < candidates.length; ) {
            candidate.add(candidates[i]);
            helper(candidates, result, candidate, rest - candidates[i], i + 1);
            candidate.remove(candidate.size() - 1);
            int offset = 1;
            while (i + offset < candidates.length && candidates[i + offset] == candidates[i]) { offset++; }
            i += offset;
        }
    }
}
