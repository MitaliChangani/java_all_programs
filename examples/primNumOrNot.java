// check is this number is prime or not?

import java.util.*;
public class primNumOrNot {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = in.nextInt();

        boolean isPrime = true;        // Initializes a boolean variable 'isPrime' to true, assuming the number is prime initially
        for(int i=2; i<=n/2; i++) {    // Loop from 2 to n/2 (inclusive). No need to check beyond n/2 for factors.
            if(n % i == 0) {           // Checks if 'n' is divisible by 'i'
                isPrime = false;       // If 'n' is divisible by 'i', set 'isPrime' to false indicating 'n' is not prime
                break;                 // Exit the loop early since we've found that 'n' is not prime
            }
        }
        if(isPrime) {                     // If 'isPrime' is still true after the loop, then 'n' is prime
           if(n == 1) {                  // Special case: 1 is neither prime nor composite
               System.out.println("This is neither prime nor composite");
           } else { 
               System.out.println("This is a prime number"); // Prints if 'n' is a prime number
        }
        } else {
            System.out.println("This is not a prime number"); // Prints if 'n' is not a prime number
        }
}
}

    