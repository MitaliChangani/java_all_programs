public class factorialUsingRecursion {
    public static void printFectorial(int i, int n, int factorial){
        if(i==n){
            factorial = factorial * i;
            System.out.println(factorial);
            return;
        }
        factorial *=i;
        printFectorial(i+1, n, factorial);
    }
    public static void main(String[] args){
        printFectorial(1, 6, 1);   // here the 1 = initial point of i, n= ending point , factorial =1 because if the factorial is 0 then the answerwill be the 0
    }
}


// there is another way to print the factorial of the given number

