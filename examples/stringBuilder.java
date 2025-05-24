// use of stringBuilder class in java

import java.util.*;
public class stringBuilder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Tony Stark");
        System.out.println(sb);

        System.out.println(sb.charAt(5));

        sb.setCharAt(1,'a');    //to change the character at specific index
        System.out.println(sb);

        sb.insert(2,'n');  //to insert the character at the specific index
        System.out.println(sb);
        sb.delete(2,4 );
        System.out.println(sb);

        sb.append(" hello");
        System.out.println(sb);

        System.out.println(sb.length());
    }
}
