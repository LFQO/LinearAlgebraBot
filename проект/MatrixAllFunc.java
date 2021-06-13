package проект;

public class MatrixAllFunc {
    double A[][];
    double B[][];

    public MatrixAllFunc(double A[][], double B[][]) {
        this.A = A;
        this.B = B;
    }

    double[][] sum(double A[][], double B[][]) {
        int N = A.length;
        double matrix[][] = new double[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                matrix[i][j] = A[i][j] + B[i][j];
        return matrix;
    }

    double[][] sub(double A[][], double B[][]) {
        int N = A.length;
        double matrix[][] = new double[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                matrix[i][j] = A[i][j] - B[i][j];
        return matrix;
    }
    double[][] mul(double A[][], double B[][]) {
        int m = A.length;
        int n = B[0].length;
        int o = B.length;
        double[][] matrix = new double[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    matrix[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return matrix;
    }

    double[][] trans(double A[][]) {
        int n = A.length;
        int m = A[0].length;
        double[][] matrix = new double[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                matrix[i][j] = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = matrix[i][j];
            }
        }
        return matrix;
    }

    public double matrixDetetminant(double A[][]) {
        int n = A.length;
        if (n == 1) return A[0][0];
        double det = 0;
        double B[][] = new double[n - 1][n - 1];
        int l = 1;
        for (int i = 0; i < n; ++i) {
            int x = 0, y = 0;
            for (int j = 1; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    if (i == k) continue;
                    B[x][y] = A[j][k];
                    ++y;
                    if (y == n - 1) {
                        y = 0;
                        ++x;
                    }
                }
            }
            det += l * A[0][i] * matrixDetetminant(B);
            l *= (-1);
        }
        return det;
    }
}
//ppp
