import java.util.Scanner;

public class ArrayRowSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        
        for(int i=0; i<row;i++){
            for(int j =0; j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int[] sumRow = new int[row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sumRow[i] += matrix[i][j];
            }
        }

        for(int i=0;i<row;i++){
            System.out.println("sum of row#"+i+"is "+sumRow[i]);
        }
    }
}