
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args)
    {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = in.nextInt();
        if(n %2 == 0)
        {
            System.out.println("The nimber is even.");
        }
        else{
            System.out.print("The number is odd.");
        }
    }
}
