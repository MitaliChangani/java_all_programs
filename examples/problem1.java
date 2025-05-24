// find the average of three number out of three

import java.util.*;
public class problem1 {
    public static void FindAverage(){
       Scanner in = new Scanner(System.in);
       int a=in.nextInt();
       int b=in.nextInt();
       int c=in.nextInt();

       int average = (a+b+c)/3;
       System.out.print("average of three numbers is : "+average);
   } 
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       FindAverage();
   }
}
