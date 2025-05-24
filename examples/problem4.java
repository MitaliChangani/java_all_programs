//  find the circumference of the circle

import java.util.*;
public class problem4{
    public static void circumferenceCircle(){
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double  circumference = 2*3.14*r;
        System.out.print("the circumference of the circle is : "+ circumference);
        
    }
    public static void main(String[] args){
        circumferenceCircle();
    }
}
