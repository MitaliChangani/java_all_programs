// inverted half pyramid with number

import java.util.*;
public class INverHalfPyraWithNumb {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);

        // for(int i=5;i>=1;i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);

        //     }
        //     System.out.println("");
        // }
        int n=in.nextInt();  

        for(int i=1;i<=5;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);

            }
            System.out.println("");
        }
    }
}
