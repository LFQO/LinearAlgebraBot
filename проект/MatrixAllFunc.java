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
}
