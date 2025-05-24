// half pyramis with numbers

import java.util.*;
public class HalfpyramidWithNumb {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        for(int i=5; i>=1; i--){
            for(int j=1; j<=i;j++){
                System.out.print(j + " ");
               
            }
            System.out.println(" ");
        }

    }
}
