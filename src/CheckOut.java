import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        double cost= SafeInput.getRangedDouble(in, "Enter price of your item.", .50, 10.00);
        boolean confirm= SafeInput.getYNConfirm(in, "Got more?");
    }
}
