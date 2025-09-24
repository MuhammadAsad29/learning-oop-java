public class matrix_6x6 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 10, 20, 30},
                {4, 5, 6, 40, 50, 60},
                {7, 8, 9, 70, 80, 90},
                {11, 12, 13, 110, 120, 130},
                {14, 15, 16, 140, 150, 160},
                {17, 18, 19, 170, 180, 190},
        };
        System.out.println("numbers:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}