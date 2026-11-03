import java.util.Scanner;
public interface FavNumbers {
    public static void main(String[] args){
    Scanner in= new Scanner(System.in);
    int fav1= SafeInput.getInt(in, "What is your favorite numbers?");
    double fav2= SafeInput.getDouble(in, "What is your second favorite number?");
        System.out.println("Your favorite numbers are "+ fav1 +" and "+ fav2);
    }
}
