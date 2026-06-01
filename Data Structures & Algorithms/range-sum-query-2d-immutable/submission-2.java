class NumMatrix {
    int[][] sumMatrix;

    public NumMatrix(int[][] matrix) {
        int rowCount = matrix.length, columnCount = matrix[0].length;
        this.sumMatrix = new int[rowCount + 1][columnCount + 1];

        for (int r = 0; r < rowCount; r++) {
            int prefix = 0;
            for (int c = 0; c < columnCount; c++) {
                prefix += matrix[r][c];
                int above = this.sumMatrix[r][c + 1];
                this.sumMatrix[r + 1][c + 1] = prefix + above;
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++; col1++; row2++; col2++;
        int bottomRight = this.sumMatrix[row2][col2];
        int left = this.sumMatrix[row2][col1-1];
        int top = this.sumMatrix[row1-1][col2];
        int topLeft = this.sumMatrix[row1-1][col1-1];
        return bottomRight - left - top + topLeft;
    }
}