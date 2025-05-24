import java.util.*;
class SecondBubbleSort
{
    public static void printArray(int[] a){
        for(int i=0; i<=a.length-1;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] a = {8, 1, 9, 4, 3};

        for(int i=0; i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j] > a[j+1]){

                   int temp = a[j];
                   a[j] = a[j+1];
                   a[j+1] = temp;
                }

            }
        }
        printArray(a);
    }
}