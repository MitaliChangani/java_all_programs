// public class sumOfNNaturalNumberUsingRecursion{
//     public static void PrintSum(int n,int sum){
        
//         if(n == 6){
//             System.out.println(sum);
//             return;
//         }
//         sum = sum + n;
//         PrintSum(n+1, sum);
//     }
    
//     public static void main(String[] args){
//         // int n = 1;
//         PrintSum(1, 0);  //here the 1 is the n's initial value and 0 is the sum's initial value
        
        // if we want to do fectorial ,we can simply write '*' operator instead of '+'
//     } 

// }

// there is the another way to calculate the sum of n natural number

public class sumOfNNaturalNumberUsingRecursion{
    public static void printSum(int i, int n, int sum){
        if(i==n){
            sum = sum+i;
            System.out.println(sum);
            return;
        }
        sum = sum +i;
        printSum(i+1, n, sum);

        // here the i will print when we return to the memory after the print the sum
        // that's why the i will print in descending order. the output will be 4,3,2,1

        System.out.println(i);
    }
    public static void main(String[] args){
        printSum(1, 5, 0);    // here 1=initial value of i, n=ending value, 0=initial value of the sum
    }
}