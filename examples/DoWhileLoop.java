
import java.util.*;
public class DoWhileLoop {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i= 0;
        do{
            System.out.println(i);
            i++;  // if we have not write this increment operation than our loop will be infinite.
        }while(i<=9);
    }
}
