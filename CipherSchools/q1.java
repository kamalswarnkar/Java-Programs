import java.util.Scanner;

public class MatrixPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        System.out.println("Enter elements of first matrix:");
        inputMatrix(sc, matrix1, rows, cols);

        System.out.println("Enter elements of second matrix:");
        inputMatrix(sc, matrix2, rows, cols);

        System.out.println("First Matrix:");
        printMatrix(matrix1, rows, cols);

        System.out.println("Second Matrix:");
        printMatrix(matrix2, rows, cols);

        sc.close();
    }

    static void inputMatrix(Scanner sc, int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
