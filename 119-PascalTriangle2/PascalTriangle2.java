public class Solution {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex < 0) {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> row = new ArrayList<Integer>(rowIndex + 1);
        row.add(1);
        for (int i = 0; i < rowIndex; i++) {
            row.add(1);
            for (int j = i; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        return row;
    }
}
