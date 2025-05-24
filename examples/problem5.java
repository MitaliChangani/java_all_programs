//  find the preson is eligible for vote or not

import java.util.*;
public class problem5 {
    public static void Eligiblity(){
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if(age<18){
            System.out.print("the person is not eligible for the vote.");
        }
        else{
            System.out.print("the person is the eligible for the vote.");
        }
    }
    public static void main(String[] args){
        Eligiblity();
    }
}
