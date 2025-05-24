// to print the string pyramid
// import java.util.*;
public class pyramid{
    public static void main(String[] args){
          String s = "Stream";
          for(int i=0;i<=s.length()-1;i++){
            for(int j=1;j<=s.length()-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(s.charAt(j)+ " ");
            }
            System.out.println("");
          }
    }
}
