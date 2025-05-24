// inverted half pyramid

import java.util.*;
public class InvertHalfPyramidPattern {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        for(int i=5; i>=1; i--){
            for(int j=1;j<=i;j++){      // here the number of columns will be the same as the row number
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
