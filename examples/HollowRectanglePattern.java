// hollow rectangle pattern 

import java.util.*;
public class HollowRectanglePattern {
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter the vale of rows:");
    int rows = in.nextInt();
    System.out.print("Enter the vale of columns:");
    int columns = in.nextInt();
    
    for(int i=1;i<=rows;i++){
        for(int j=1;j<=columns;j++ ){
            if(i==1 || j==1 || i==rows || j==columns){
               System.out.print("*");
            }else{
               System.out.print(" ");
              }
        }
        System.out.println(); 
    }
}
}
