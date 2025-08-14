import java.util.Random;

public class MatrixOperations {

    // Generate random matrix
    public static double[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10);  // 0 to 9
        return matrix;
    }

    // Display matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row)
                System.out.printf("%6.2f ", val);
            System.out.println();
        }
    }

    // Matrix addition
    public static double[][] add(double[][] A, double[][] B) {
        int r = A.length, c = A[0].length;
        double[][] result = new double[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    // Matrix subtraction
    public static double[][] subtract(double[][] A, double[][] B) {
        int r = A.length, c = A[0].length;
        double[][] result = new double[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    // Matrix multiplication
    public static double[][] multiply(double[][] A, double[][] B) {
        int r1 = A.length, c1 = A[0].length;
        int r2 = B.length, c2 = B[0].length;
        if (c1 != r2) throw new IllegalArgumentException("Incompatible for multiplication");

        double[][] result = new double[r1][c2];
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }

    // Transpose of a matrix
    public static double[][] transpose(double[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        double[][] result = new double[c][r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                result[j][i] = matrix[i][j];
        return result;
    }

    // Determinant for 2x2 matrix
    public static double determinant2x2(double[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    // Determinant for 3x3 matrix
    public static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) throw new ArithmeticException("Matrix is singular");

        double[][] inv = {
            { m[1][1]/det, -m[0][1]/det },
            { -m[1][0]/det, m[0][0]/det }
        };
        return inv;
    }

    // Inverse of 3x3 matrix
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) throw new ArithmeticException("Matrix is singular");

        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;
        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;
        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }

    public static void main(String[] args) {
        System.out.println("Matrix A:");
        double[][] A = generateMatrix(3, 3);
        displayMatrix(A);

        System.out.println("\nMatrix B:");
        double[][] B = generateMatrix(3, 3);
        displayMatrix(B);

        System.out.println("\nA + B:");
        displayMatrix(add(A, B));

        System.out.println("\nA - B:");
        displayMatrix(subtract(A, B));

        System.out.println("\nA * B:");
        displayMatrix(multiply(A, B));

        System.out.println("\nTranspose of A:");
        displayMatrix(transpose(A));

        System.out.println("\nDeterminant of A: " + determinant3x3(A));

        try {
            System.out.println("\nInverse of A:");
            displayMatrix(inverse3x3(A));
        } catch (ArithmeticException e) {
            System.out.println("Matrix A is singular and has no inverse.");
        }
    }
}
