//  sum of two number in java

import java.util.*;
class SumOfTwoNumb{
    public static int sumOfTwoNumber(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = in.nextInt();
        System.out.print("Enter the value of b:");
        int b = in.nextInt();
        System.out.print("sum of two numbers is : " + sumOfTwoNumber(a,b));
    }
}