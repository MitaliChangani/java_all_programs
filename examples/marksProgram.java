// Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.

import java.util.*;

public class marksProgram {
   public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int num;
    
        do{
            System.out.print("Enter your marks out of 100:");
            int marks = in.nextInt();
            if(marks>=90){
                System.out.println("This is good.");
            }else if(marks>=60 && marks<=89){
                System.out.println("This is also good.");

            }else{
                System.out.println("This is good as well.");
            }
            System.out.println("Do you want to contimue:yes(1) or no(0):");
            num = in.nextInt();

        }while(num == 1);
    
   } 
}
