class NumMatrix {
    int[][] matrix;
    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i = 0; i < (row2 - row1 + 1); i++ ){
            for (int j = 0; j < (col2 - col1 + 1); j++){
                sum += this.matrix[row1+i][col1+j];
            }
        }
        return sum;
    }
}

