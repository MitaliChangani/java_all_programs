// find the fectorial of number
// method 1:
// import java.util.*;
// public class FectorialOfNumber {
//     public static int factorial(int n){
//         if( n==1 || n==0){
//             return 1;
//         }
//         else{
//         return n*factorial(n-1);
//         }
//     }
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in); 
//         System.out.print("enter the value of n:");
//         int n = in.nextInt();
        
        
//         System.out.print("fectorial of given number is : "+ factorial(n));
//     }
// }

// method 2:

import java.util.*;
public class FectorialOfNumber{
    public static void factorialNumber(int n){
        if(n<0){
            System.out.print("the number is Invalid:");
        }
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;

        }
        System.out.print("fectorial of entered number is:"+factorial);
        return;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = in.nextInt();

        factorialNumber(n);
    }
}


