
import java.util.Scanner;

public class ArrayTwoD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int[] rowSum = new int[row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rowSum[i] += array[i][j];
            }
        }
        int[] colSum = new int[col];
        for (int j = 0; j < row; j++) {
            for (int i = 0; i < col; i++) {
                colSum[j] += array[i][j];
            }
        }

        for (int x : rowSum) {
            System.out.print(x+" ");
        }
        System.out.println();
        for (int y : colSum) {
            System.out.print(y+" ");
        }
        
    }
}
