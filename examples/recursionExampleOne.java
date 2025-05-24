// the recursion start untill reach to the base case/base condition
public class recursionExampleOne
{
    public static void PrintNumber(int n){
        if(n==0){    // this is the base condition or case
            return;
        }
         System.out.println(n);
         PrintNumber(n-1);   // this is the recursion - function calls itself
    }
    public static void main(String[] args){
        int n=5;
        PrintNumber(n);
    }
}


//  in the iteration the space allocate to a variable to no.of variable
//   but in the recursion how many times fuction is called that times space is allocate to a single variable
//   so in the recursion the stack overflow is occure when we can not defin the base case