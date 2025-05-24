
import java.util.*;
public class reverseString2 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("hello");
        for (int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length() - 1 -i; //5-1-0   it will give the last character

            char frontChar = sb.charAt(front);  // it will store the front character in the variable  frontChar
            System.out.println(frontChar);     //it will print the frontChar

            char backChar = sb.charAt(back);    // it will the store the last character  in the varible backChar
            System.out.println(backChar);       //it will print the backChar
  
            sb.setCharAt(front, backChar);   // it will replace the front character to the back
            sb.setCharAt(back, frontChar);   // it will replace the back character to the front
        }
        System.out.println(sb);   // it will print the reverse string
    }
}
