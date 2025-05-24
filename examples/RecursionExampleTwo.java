public class RecursionExampleTwo {
    public static void PrintNumber(int n){
        if(n==6){  // here we can write the condition (n>5) or (n>max_number)
            return;
        }
        System.out.print(n+" ");
        PrintNumber(n+1);
    }
    public static void main(String[] args){
        int n = 1;  // starting condition
        PrintNumber(n);
    }
}
