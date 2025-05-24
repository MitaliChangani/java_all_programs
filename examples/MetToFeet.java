import java.util.Scanner;
class MetToFeet {
    public static void main(String[] args) {
        double meters, feets;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the meters:");
        meters = in.nextDouble();
        feets = meters * 3.28;
        System.out.println(feets + "feets");
    }
}