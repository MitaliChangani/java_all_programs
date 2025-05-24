
import java.util.*;
public class printTable {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter the number for the table:");
        n = in.nextInt();
        for(int i=1;i<=10;i++){
            int table = n*i;
            System.out.println(table);
        }
    }
}
