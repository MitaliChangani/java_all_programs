import java.util.*;
public class calculater {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a, b, choice;
        System.out.print("Enter the value of the number a:");
        a = in.nextInt();
        System.out.print("Enter the value of number b:");
        b = in.nextInt();

        System.out.println("1.Addition \t 2.Subtraction \t 3.Multiplication \t 4.Division \t 5.Modulus");
        System.out.print("Enter your choice:");
        choice = in.nextInt();
        
        switch(choice){
            case 1: 
            System.out.print("Addition of two numbers are:"+ (a+b));
            break;
            case 2: 
            int subtract = a-b;
            System.out.print("Subtraction of two numbers are:"+ subtract);
            break;
            case 3: 
            System.out.print("Multiplication of two numbers are:"+ a*b);
            break;
            case 4: 
            System.out.print("Division of two numbers are:"+ a/b);
            break;
            case 5: 
            System.out.print("Modulus of two numbers are:"+ a%b);
            break;
            default: 
            System.out.print("Invalid choice");
            break;

        }


    }
}
