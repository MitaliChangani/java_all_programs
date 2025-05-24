//  palindromic pattern

import java.util.*;
public class PalindromPattern {
    public static void main(String[] ars){
        Scanner in = new Scanner(System.in);
        int n=5;

        for(int i=1; i<=n; i++){         // this loop is for rows in pattern
            for(int j=1;j<=n-i;j++){     // this loop is for spaces
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){       // this loop is for first part of the pattern.
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){        // this loop is for second part of pattern.
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
