
import java.util.Scanner;

public class RupToDell {
    public static void main(String[] args) 
    {
      double rupees;
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter the rupees:");
      rupees = in.nextDouble();
      double dollars = rupees * 85.45;
      System.out.println(dollars + "Dollars");
    }
}
