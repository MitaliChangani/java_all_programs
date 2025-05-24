import java.util.*;
public class DecrementOrder {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the value of n1:");
       int n1 = in.nextInt();
       System.out.print("Enter the value of n2:");
       int n2 = in.nextInt();
       System.out.print("Enter the value of n3:");
       int n3 = in.nextInt();

       int[] arr = {n1,n2,n3};
       Arrays.sort(arr);
       for(int i=arr.length-1;i>=0;i--){
        System.out.print(arr[i]+" ");
        }
    }
}
