
import java.util.*;
public class switchCondition {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number;
        System.out.println("Enter the number 1 to 3:");
        number = in.nextInt();

        switch(number){
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("namste");
            break;
            case 3: System.out.println("bonjur");
            break;
            default : System.out.println("Invalid");
            break;
            
        }
    }
    
}
