//to clear the bit in the original number
// if we want to clear the bit first thing to do is te find the bit mask , second thing is the bitwise NOT operation with the Bitwise and the the third thing is the do bitwise And operation with the reversed bitmask and the original number 
import java.util.*;
public class ClearBitExample {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n:"); // if the entered number is the 5 then the answer will be the 1
        int n = in.nextInt();
        int pos = 2;
        int bitMask = 1<<pos;
        int rBitMask = ~(bitMask);
        System.out.println("The new number is the :"+ (rBitMask & n));
    }
}
 