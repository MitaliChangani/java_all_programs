// bit manipulation in java 
import java.util.*;
public class GetBitExample {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");  // if i enter the n=5 the answer will be the zero because the binary no of the 5 is 0101 and the third position of the binary 5 is 0
        int n = in.nextInt();
        int pos = 3;
        int bitMask = 1<<pos;

        if((bitMask & n)==0){   // if we want to get the bit in the number we need to perform the "bitwise And" operation, Here the number will not change after the operation
            System.out.println("The number was zero.");
        }
        else{
            System.out.println("The number was one");
        }
    }
}
