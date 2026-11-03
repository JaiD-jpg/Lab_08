import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class DevTest {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        String name= SafeInput.getNonZeroLenString(in, "What's your name?");
        System.out.println("Your name is "+ name);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        int favNum= SafeInput.getInt(in, "What is your favorite number?");
        System.out.println("Your favorite is "+ favNum);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        double idk= SafeInput.getDouble(in, "Type a price.");
        System.out.println("The price of your item is "+ idk);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        int range= SafeInput.getRangedInt(in, "Enter any number between", 1, 100);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        double rangePt2= SafeInput.getRangedDouble(in, "Enter number from", 50, 90);
        System.out.println("Number is "+ rangePt2);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        boolean continueYN= SafeInput.getYNConfirm(in,"Continue?");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        String SSN= "";
        SSN= SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{3}$");
        System.out.println("Your SSN is "+ SSN);
    }
}
