class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int row = 0;
        int col = n - 1;
        int count = 0;

        while (row < m && col >= 0) {
            if (grid[row][col] < 0) {
                // niche ke saare elements negative honge
                count += (m - row);
                col--; // left move
            } else {
                row++; // down move
            }
        }
        return count;
    }
}
