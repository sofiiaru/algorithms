class NumMatrix {
    int[][] matrix;

    public NumMatrix(int[][] matrix) {
        this.matrix = new int[matrix.length][];

        for(int i=0; i<matrix.length; i++){
            this.matrix[i] = new int[matrix[i].length];
            for(int j=0; j<matrix[i].length; j++){
                this.matrix[i][j] = matrix[i][j];
                if(j>0)this.matrix[i][j] += this.matrix[i][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sumRegion = 0;
        for(int i=row1; i<= row2; i++){
            sumRegion+= matrix[i][col2];
            if(col1 > 0) sumRegion-= matrix[i][col1-1];
        }
        return sumRegion;
        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */