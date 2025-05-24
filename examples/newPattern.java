public class newPattern {
   public static void main(String[] args){
    int rows = 6; // Number of rows in the pattern
        int start = 1; // First number in the pattern

        for (int i = 1; i <= rows; i++) {
            int num = start;
            System.out.print(num); // Print first number
            
            int decrement = i; // Define the decrement value
            while (decrement > 0) {
                num -= decrement; // Subtract decrement from num
                System.out.print(" " + num);
                decrement--;
            }

            System.out.println();
            start += (i < 3 ? 5 : 3);
        } 
   }
}
    
    