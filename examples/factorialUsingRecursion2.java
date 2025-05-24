public class factorialUsingRecursion2 {
    public static int printFactorial(int n){
        if(n==1 || n==0){
            return 1;
        }

        int factorial_nm1 = printFactorial(n-1);
        int factorial_n = n*factorial_nm1;
        return factorial_n;
    }
    public static void main(String[] args){
        int fect = printFactorial(5);
        System.out.println(fect);
    }
}
