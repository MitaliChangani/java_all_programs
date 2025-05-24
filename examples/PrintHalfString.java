// write the half of string
import java.util.*;
public class PrintHalfString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any word:");
        String s = in.nextLine();
        System.out.println(s.length());
        for(int i=s.length()/2;i<=s.length()-1;i++){
            System.out.print(s.charAt(i));
        }
    }
}
