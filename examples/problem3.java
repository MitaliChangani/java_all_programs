//  create the function to print the largest number out of three entered by the user.

import java.util.*;
public class problem3{
    public static void LargestNumb(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a>b && a>c){
            System.out.print("a is largest number.");
        }else if(b>a && b>c){
            System.out.print("b is the lagest number.");
        }else{
            System.out.print("c is the largest number");
        }
    }
    public static void main(String[] args){
       

        LargestNumb();
    }
}