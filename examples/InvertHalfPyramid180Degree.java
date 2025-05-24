// inverted haif pyramis 180 degree ritated

import java.util.*;
public class InvertHalfPyramid180Degree {
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();


    //         *   here the space is==n-i means(i=1 so the space is 5-1=4)
    //        **   here the space is ==n-1 means(i=2 so the space is 5-2=3)
    //       ***   here the space is ==2
    //      ****   here the space is ==1
    //     *****   here the sapce is ==0
     // this logic is used to print the space 
     // we will use two inner loop to print the space and *'s

       for(int i=1;i<=n;i++){

        for(int j=1;j<=n-i;j++){     // the first inner looop is for the print the spaces
        
           System.out.print(" ");
        }
        for(int j=1;j<=i;j++){       // the second inner loop is to print the *'s
            System.out.print("*");
        }
        
        System.out.println("");
       }
    }
}
