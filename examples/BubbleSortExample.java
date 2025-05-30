import java.util.*;
class BubbleSortExample{
    public static void printArray(int a[])
    {
      for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
      }
      System.out.println();
    }
    public static void main(String[] args){
        int[] a = {7,8,3,1,2};
        
        // the time-complexity is the O(n^2)
        // bubble sort

        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j] > a[j+1]){
                   //swap the two number
                   int temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
                }
            }
        }
        printArray(a);

    }
}