// to update the bit in the original number to 0 or 1
// there are to cases in the update a bit
// if we want to update in the 1 the operation will be the : AND with NOT, Basically this is the clear bit operation
//if we want to update in the 0 the operation will be the : OR, Basically this is the set Bit operation

import java.util.*;
public class UpdateBItExample {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value of n:");  // to take the input from the user for the number
        int n = in.nextInt();

        int pos = 1;
        int bitMask = 1<<pos;

        System.out.println("Enter the value of the operation (0/1):");  // to take the inpute from the user for 2 cases
        int operation = in.nextInt();

        if(operation==1){  // if the operation=1
            int newNumber = bitMask | n;  // if we wnat to set the bit in the number and change it we need to perform "bitwise or " operation , Here the number will change after the operation
            System.out.println("The new number is the "+newNumber);
        }
        else{  // if the operation=0
          int rBitMask = ~(bitMask); 
          System.out.println("The new number is the :"+ (rBitMask & n));
        }
        
    }
}
