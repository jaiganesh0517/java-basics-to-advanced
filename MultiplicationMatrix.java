class MultiplicationMatrix {
    public int[][] multiply(int[][] A, int[][] B) {

        int m = A.length;        // rows of A
        int n = A[0].length;     // cols of A = rows of B
        int p = B[0].length;     // cols of B

        int[][] result = new int[m][p];

        for (int i = 0; i < m; i++) {          // rows of A
            for (int j = 0; j < p; j++) {      // cols of B
                for (int k = 0; k < n; k++) {  // common dimension
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }
}