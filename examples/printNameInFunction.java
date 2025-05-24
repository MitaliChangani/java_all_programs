//  print given name in a function.

import java.util.*;
public class printNameInFunction {
    public static void printMyName(String name){
        System.out.println(name);
         return;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();          // here we can write line String name = in.next(); instead of String name = in.nextLine();
        printMyName(name);
    }
}
