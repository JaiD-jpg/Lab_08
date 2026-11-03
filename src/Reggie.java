import java.util.Scanner;

public class Reggie {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String SSN= SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{3}$");
        System.out.println("Your SSN is "+ SSN);

        System.out.println("~~~~~~~~~~~~~~~~~~~");

        String Mnum= SafeInput.getRegExString(in,"Enter your UC M Number", "(M|m)\\d{5}$");
        System.out.println("Your UC M number is "+ Mnum);

        System.out.println("~~~~~~~~~~~~~~~~~~~");

        String menuOp= SafeInput.getRegExString(in, "Choose an item", "[A-Za-z]*[OoSsVvQq]$");
        System.out.println("Your choice is "+ menuOp);
    }
}
