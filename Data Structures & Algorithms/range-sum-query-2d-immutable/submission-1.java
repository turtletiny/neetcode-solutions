class NumMatrix {
    int[][] sumMatrix;

    public NumMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        this.sumMatrix = new int[rows + 1][columns + 1];
        for (int r = 0; r < rows; r++) {
            int prefix = 0;
            for (int c = 0; c < columns; c++) {
                prefix += matrix[r][c];
                int above = this.sumMatrix[r][c + 1];
                this.sumMatrix[r + 1][c + 1] = prefix + above;
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int bottomRight = this.sumMatrix[row2 + 1][col2 + 1];
        int left = this.sumMatrix[row2 + 1][col1];
        int above = this.sumMatrix[row1][col2+1];
        int topLeft = this.sumMatrix[row1][col1];
        return bottomRight - left - above + topLeft;

    }
}
