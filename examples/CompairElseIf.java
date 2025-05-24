
import java.util.Scanner;
public class CompairElseIf {
    public static void main(String[] args)
    {
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        a = in.nextInt();

        System.out.print("Enter the value of b:");
        b = in.nextInt();

        if(a == b){
            System.out.println("a is equal to b.");
        } else if(a<b){
                System.out.println("a is less then b");
            } else {
                System.out.println("a is grater then b.");
            }
        
    }
}
