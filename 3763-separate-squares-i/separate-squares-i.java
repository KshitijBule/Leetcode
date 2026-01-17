class Solution {
    public double separateSquares(int[][] squares) {
        double low = Double.MAX_VALUE;
        double high = Double.MIN_VALUE;

        // Step 1: Find search range
        for (int[] sq : squares) {
            double y = sq[1];
            double l = sq[2];
            low = Math.min(low, y);
            high = Math.max(high, y + l);
        }

        // Step 2: Binary search for precision
        for (int iter = 0; iter < 100; iter++) {
            double mid = (low + high) / 2.0;
            double below = 0.0, above = 0.0;

            for (int[] sq : squares) {
                double y = sq[1];
                double l = sq[2];
                double bottom = y;
                double top = y + l;

                if (mid <= bottom) {
                    // Entire square above the line
                    above += l * l;
                } else if (mid >= top) {
                    // Entire square below the line
                    below += l * l;
                } else {
                    // Line cuts the square
                    below += l * (mid - bottom);
                    above += l * (top - mid);
                }
            }

            if (below < above) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return low;
    }
}
