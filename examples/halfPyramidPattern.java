// half pyramid pattern 

import java.util.*;
public class halfPyramidPattern {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){      // the inner loop will circluler i times 
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
