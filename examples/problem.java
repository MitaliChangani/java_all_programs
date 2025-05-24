//  take an array as input from the user . Search for a given number a and print the index at which it occurs.

import java.util.*;
public class problem {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int n = in.nextInt();

        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i] = in.nextInt();
        }

        System.out.print("Enter the value of x:");
        int x= in.nextInt();

       for(int i=0; i<n; i++){
        if(array[i]==x){
            System.out.println("x fount at index: "+i);
        }
       }
    }
}
