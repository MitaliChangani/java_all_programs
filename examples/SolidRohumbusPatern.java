//  solid rohumbus pattern

import java.util.*;
public class SolidRohumbusPatern {
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for( int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
     }
}
