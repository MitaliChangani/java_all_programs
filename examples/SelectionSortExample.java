import java.util.*;
public class SelectionSortExample {
    public static void printArray(int a[])
    {
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
    //time complexity = O(n^2)
    public static void main(String[] args){
        int[] a={7,8,3,1,2};
        for(int i=0;i<a.length-1;i++){
            int smallest = i;
            for(int j=i+1; j<a.length;j++){
                if(a[smallest] > a[j]){
                    smallest=j;
                }
            }
            int temp = a[smallest];
            a[smallest]=a[i];
            a[i]=temp;
        }
        
        printArray(a);
    }
}                       
