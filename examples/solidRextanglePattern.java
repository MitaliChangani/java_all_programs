//  solid rectangle pattern

import java.util.*;
public class solidRextanglePattern {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the vale of rows:");
        int rows = in.nextInt();
        System.out.print("Enter the vale of columns:");
        int columns = in.nextInt();

    //  outer loop
    for(int i=1; i<=rows;i++){
        // inner loop
       for(int j=1;j<=columns;j++){   // here the outer loop circulate one time that time the inner loop will circulate n times mins the columns value times.
        System.out.print("*");
       }
       System.out.println("");
    }

    }
}
 