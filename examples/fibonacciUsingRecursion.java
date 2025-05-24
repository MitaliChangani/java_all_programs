public class fibonacciUsingRecursion {
    public static void printFibonnaci(int a, int b, int n){   // here we can use the i and n together 
          
        // here the a= second last term and the b=last term
        
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFibonnaci(b, c, n-1);  // here the b = new a and the c= new b and the no.of term will decresing by 1
    }
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int n = 10;
        System.out.println(a);
        System.out.println(b);
        printFibonnaci(a, b, n-2);  // here the 1 and 2 term is 1, and 2 so the term will start to the n-2
    }
}
