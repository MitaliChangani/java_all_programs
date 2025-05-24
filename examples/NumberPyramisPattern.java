//  number pyramid pattern 

import java.util.*;
public class NumberPyramisPattern {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){

                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
