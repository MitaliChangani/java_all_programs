// print the sum of all odd number

import java.util.*;
public class problem2 {
    public static void SumOfOddNumber(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
          if(i%2!=0){
             System.out.println(i+" ");
             sum = sum +i;
            }
            
        }
        System.out.print("Sum of the n odd number is :"+sum);
    }
    public static void main(String[] args){
        SumOfOddNumber();

    }
}
