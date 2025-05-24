//  two numbers entered by the user, x and y. write a function to finde the value of one of number raised to the power of another i.e, x^n.

import java.util.*;
public class problem8 {
    public static void exponential(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value of n:");
        double n = in.nextDouble();
        System.out.print("enter the value of x:");
        double x = in.nextDouble();
         
        double power = Math.pow(x,n);
        
        System.out.print(power);
    }
    public static void main(String[] args){

        exponential();
    }
}
