
import java.util.Scanner;
public class cramerRule {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Values for the Equation:-1 :");
        System.out.print("Enter the value for a:");
        double a = in.nextDouble();
        System.out.print("Enter the value for b:");
        double b = in.nextDouble();
        System.out.print("Enter the value for e:");
        double e = in.nextDouble();

        System.out.println("Values for the Equation:-2 :");
        System.out.print("Enter the value for c:");
        double c = in.nextDouble();
        System.out.print("Enter the value for d:");
        double d = in.nextDouble();
        System.out.print("Enter the value for f:");
        double f = in.nextDouble();

        double x = ((e*d)-(b*f))/((a*d)-(b*c));
        double y = ((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("x=" + x + " y=" + y);

    }
}
