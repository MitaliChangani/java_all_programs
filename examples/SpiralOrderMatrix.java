// Print the spiral order matrix as output for a given matrix of numbers

import java.util.*;
public class SpiralOrderMatrix {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of rows:");
        int rows = in.nextInt();

        System.out.print("Enter the value of columns:");
        int cols = in.nextInt();

        int[][] arrTwoD = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arrTwoD[i][j] = in.nextInt();
            }
        }
        // output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arrTwoD[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Spiral Order Matrix:");
        int row_start=0, row_end=rows-1, cols_start=0, cols_end=cols-1;
        int dir=0;
        while(row_start<=row_end && cols_start<=cols_end){
            
                for(int i=cols_start; i<=cols_end; i++){
                    System.out.print(arrTwoD[row_start][i] + " ");
                }
                row_start++;
            
            
                for(int i=row_start; i<=row_end; i++){
                    System.out.print(arrTwoD[i][cols_end] + " ");
                }
                cols_end--;
            
            
                for(int i=cols_end; i>=cols_start; i--){
                    System.out.print(arrTwoD[row_end][i] + " ");
                }
                row_end--;
            
            
                for(int i=row_end; i>=row_start; i--){
                    System.out.print(arrTwoD[i][cols_start] + " ");
                }
                cols_start++;
            
            System.out.println();
        }
    }
}
