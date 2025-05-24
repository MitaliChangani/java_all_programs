import java.util.*;
public class VowelOrConstant {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any character to check is the character is vowel or constant: ");
        String ch = in.next();
        if(ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")){
            System.out.println("The entered character is the Vowel.");
        }
        else{
            System.out.println("The entered character is the constant.");
        }
    }
}
