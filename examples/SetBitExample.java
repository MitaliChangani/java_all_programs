// to set the bit int he original number

import java.util.*;
public class SetBitExample {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = in.nextInt();  // if the enterd number is the 5 the binary form of 5 is the 0101
        int pos=1;
        int bitMask = 1<<pos;  

        int newNumber = bitMask | n;  // if we wnat to set the bit in the number and change it we need to perform "bitwise or " operation , Here the number will change after the operation
        System.out.println("The new number is the "+newNumber);
    }
}
