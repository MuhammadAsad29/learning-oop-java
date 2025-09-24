public class MultiDim_array {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 10},
                {4, 5, 6, 20},
                {7, 8, 9, 30},
                {11, 12, 13},
                {14, 15, 16},
                {17, 18, 19},
                {21, 23, 24, 25, 26},
                {27, 28, 29, 31, 32}
        };
        System.out.println("numbers:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}