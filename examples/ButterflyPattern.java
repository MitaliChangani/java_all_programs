// butterfly pattern in java

import java.util.*;
public class ButterflyPattern {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<=n; i++){    // this for loop is for upper part
            for(int j=1; j<=i; j++){  // this is for left part
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i);j++){ // this is for spaces
               System.out.print(" ");
            }
            
            for(int j=1; j<=i; j++){   // this is for right part
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=n; i>=1; i--){        // this for loop is for lower part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i);j++){
               System.out.print(" ");
            }
            
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
       
    }
}
