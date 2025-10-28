import java.util.Arrays;

public class Arrayz {

    public static void main(String[] args) {

        System.out.println("Aufgabe e)");
        System.out.println(Arrays.toString(sort(new double[] {2, 3, 4, 5})));
        System.out.println(Arrays.toString(sort(new double[] {7, 2, 10, 90})));
        System.out.println(Arrays.toString(sort(new double[] {-7, -1, 5, 20})));
        System.out.println(Arrays.toString(sort(new double[] {0, 0, 0, 0})));
        System.out.println();

        System.out.println("Aufgabe f)");
        int[][] magicSquare = {
            { 12, 6, 15, 1 },
            { 13, 3, 10, 8 },
            { 2, 16, 5, 11 },
            { 7, 9, 4, 14 }
        };
        System.out.println(isMagicSquare(magicSquare));

        int[][] nonMagicSquare = {
            { 1, 6, 15, 1 },
            { 13, 3, 10, 8 },
            { 2, 16, 5, 11 },
            { 7, 9, 4, 14 }
        };
        System.out.println(isMagicSquare(nonMagicSquare));
        System.out.println();
    }

    public static double[] sort(double[] array) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }

    public static boolean isMagicSquare(int[][] square) {
        int n = square.length;
        for (int[] row : square) {
            if (row.length != n) return false;
        }

        int targetSum = 0;
        for (int j = 0; j < n; j++) {
            targetSum += square[0][j];
        }

        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += square[i][j];
            }
            if (rowSum != targetSum) return false;
        }

        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += square[i][j];
            }
            if (colSum != targetSum) return false;
        }

        int diag1 = 0;
        for (int i = 0; i < n; i++) {
            diag1 += square[i][i];
        }
        if (diag1 != targetSum) return false;

        int diag2 = 0;
        for (int i = 0; i < n; i++) {
            diag2 += square[i][n - 1 - i];
        }
        if (diag2 != targetSum) return false;

        return true;
    }
}
