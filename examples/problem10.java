//  fibonacci series of n terms entered by the user.

import java.util.*;
public class problem10 {
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      System.out.print("enter the terms you want to end the fibonacci series:");
      int n = in.nextInt();
      int  f0=0;
      int f1=1;
      System.out.print(f0 + " "+f1);

      for (int i=2;i<n;++i){
       int fn=f0+f1;

        System.out.print(" "+fn);
        f0=f1;
        f1=fn;
      }

    }
}
