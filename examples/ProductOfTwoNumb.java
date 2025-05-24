//  multiply two number and return the product.

import java.util.*;
public class ProductOfTwoNumb {
    public static int product(int a, int b){
         int production = a*b;
         return production;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value of a:");
        int a = in.nextInt();
        System.out.print("enter the value of b:");
        int b = in.nextInt();

        System.out.print("Product of two numbers is: "+product(a,b));

    }
}
