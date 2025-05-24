// floyd's Triangle ppattern

import java.util.Scanner;
public class FloydsTrianglePattern {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number = 1;


        for(int i=1;i<=5;i++){
             for(int j=1;j<=i;j++){
                System.out.print( " "+number);
                number--;
             }
             System.out.println(" ");
        }
    }
}
