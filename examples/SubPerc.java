
import java.util.Scanner;

public class SubPerc {
    public static void main(String[] args){
        int sub1, sub2, sub3, sub4, sub5, sub6;
        double t_marks, percentages;
         Scanner in = new Scanner(System.in);
         
         System.out.println("Enter the marks of sub1:");
         sub1 = in.nextInt();

         System.out.println("Enter the marks of sub2:");
         sub2 = in.nextInt();

         System.out.println("Enter the marks of sub3:");
         sub3 = in.nextInt();

         System.out.println("Enter the marks of sub4:");
         sub4 = in.nextInt();

         System.out.println("Enter the marks of sub5:");
         sub5 = in.nextInt();

         System.out.println("Enter the marks of sub6:");
         sub6 = in.nextInt();

         t_marks = sub1 + sub2+ sub3+ sub4+ sub5+ sub6;
         percentages = (t_marks / 600)*100;
         System.out.println(percentages + "are the percentage.");
    }
}
