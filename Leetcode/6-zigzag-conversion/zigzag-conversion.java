class Solution {
    public String convert(String s, int numRows) {
        // Base cases: no transformation needed
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        int n = s.length();
        char[] result = new char[n];
        int index = 0;
        
        // The step size for a full zigzag cycle (V-shape down and up)
        int cycleLen = 2 * numRows - 2;

        // Process row by row
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < n; j += cycleLen) {
                // 1. Add the primary character in the vertical column
                result[index++] = s.charAt(j);

                // 2. Add the diagonal/inner character if we are not on the first or last row
                int diagonalIndex = j + cycleLen - 2 * i;
                if (i > 0 && i < numRows - 1 && diagonalIndex < n) {
                    result[index++] = s.charAt(diagonalIndex);
                }
            }
        }

        return new String(result);
    }
}
