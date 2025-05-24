import java.util.Scanner;
public class Declaration {
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

    }
}
