// 0-1 triangel pattern

import java.util.*;
public class ZeroOneTrianglePattern {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // int number = 1;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
              if((i+j)%2==0){
                System.out.print("1 ");
              }else{
                System.out.print("0 ");
              }
            } 
            System.out.println("");
        }
    }
}
