//  take a matix as input from the user. Search for a given number x and print the indices at which ot occurs.

import java.util.*;
public class PrintIndicesOfGivenNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of rows:");
        int rows = in.nextInt();
        System.out.print("Enter the value of columns:");
        int cols = in.nextInt();

        int findArray[][] = new int[rows][cols];

        for(int i=0;i<rows; i++){
            for(int j=0; j<cols; j++){
                findArray[i][j] = in.nextInt();
            }
        }

        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         System.out.print(findArray[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        System.out.print("Enter the value of x:");
                int x= in.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(findArray[i][j]==x){
                    System.out.print("the number is found at indecies:" + i + " " + j + " ");
                }
            }
        }
    }
}
