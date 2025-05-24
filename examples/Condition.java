
import java.util.Scanner;
public class Condition {
    public static void main(String[] args)
    {
        int age;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you age:");
        age = in.nextInt();
        if (age>18) {
            System.out.println("you are adult.");
        }else{
            System.out.println("you are not adult.");
        }
    }
}
