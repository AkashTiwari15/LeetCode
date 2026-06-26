class Solution {
    public void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        // boolean[] row = new boolean[n];
        // boolean[] col = new boolean[m];

        // // Mark rows and columns with zero
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {

        //         if (matrix[i][j] == 0) {
        //             row[i] = true;
        //             col[j] = true;
        //         }
        //     }
        // }

        // // Set zeros
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {

        //         if (row[i] || col[j]) {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }

        // SECOND APPROACH 
        
        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {

                    for (int k = 0; k < n; k++) {
                        res[k][j] = 0;
                    }
                    for (int k = 0; k < m; k++) {
                        res[i][k] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = res[i][j];
            }
        }
    }
}