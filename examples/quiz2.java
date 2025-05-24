
import java.util.*;
public class quiz2 {
    public static void main(String[] args){
        int a , b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first var:");
        a = in.nextInt();
        System.out.println("Enter your second var:");
        b = in.nextInt();
        int sum = a+b;
        System.out.println(sum);

       //without print a variables we can write this code like this: 

       //Scanner in = new Scanner(System.in);
       //int a = in.nextInt();
       //int b = in.nextInt();
       //int sum = a+b;
       //System.out.println(sum);
    }
}
