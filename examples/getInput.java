import java.util.*;

public class getInput {
    public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    //if we write only String name = in.next(); the output wiil be the only first word of input string
    //e.g., i'm giving "mitali changani" as an input the ouyput will be the only mitali.
    //so we used nextLine() instead of next() only

    String name = in.nextLine();
    System.out.println(name);
    
    }
}
