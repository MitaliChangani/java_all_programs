import java.util.*;
public class array1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        //    int numbers[] = {1,2,3,4,5};
       int newArr[] = new int[size];

       // this loop is for input from user
       for(int i=0;i<size;i++){
        newArr[i] = in.nextInt();
       }


       //this loop is for output 
       for(int i=0;i<size;i++){
        System.out.println(newArr[i]);
       }


    }
}
