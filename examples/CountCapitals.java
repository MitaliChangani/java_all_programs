
import java.util.Scanner;
public class CountCapitals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s ;
        System.out.println("Enter the line:");
        s = in.nextLine();
        char c;
        int count = 0;
        for(int i=0; i<s.length(); i++){
            c = s.charAt(i);
            if(c>=65 && c<=90){
                count++;
            }
        }
        System.out.println("total number of capital words are:" + count);
        
    }
}
