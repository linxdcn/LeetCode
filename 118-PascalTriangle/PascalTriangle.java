public class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) {
            return new ArrayList<List<Integer>>();
        } else if (numRows == 1) {
            List<List<Integer>> result = new ArrayList<List<Integer>>();
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            result.add(row);
            return result;
        } else {
            List<List<Integer>> result = generate(numRows - 1);
            List<Integer> lastRow = result.get(numRows - 2);
            List<Integer> newRow = new ArrayList<Integer>();
            newRow.add(1);
            for (int i = 1; i < numRows - 1; i++) {
                newRow.add(lastRow.get(i - 1) + lastRow.get(i));
            }
            newRow.add(1);
            result.add(newRow);
            return result;
        }
    }
}
