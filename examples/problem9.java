//  write a function to calculate the greatest common divisor(GCD) of 2 numbers

import java.util.*;
public class problem9 {
    public static void GCD(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value of x:");
        int x = in.nextInt();
        System.out.print("enter the value of y:");
        int y = in.nextInt();
        int gcd=1;
        for(int i=1;(i<=x) && (i<=y);i++){
            if(x%i==0 && y%i==0){
                gcd=i;
            }
            System.out.println(gcd);
        }
        
    }
    public static void main(String[] args){
        GCD();
    }
}
