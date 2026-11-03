import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int year= SafeInput.getRangedInt(in, "Year: ", 1950, 2015);
        int month= SafeInput.getRangedInt(in, "Month: ", 1, 12);
        int day= SafeInput.getRangedInt(in, "Day: ", 1, 30);
        int hour= SafeInput.getRangedInt(in, "Hour: ", 1,24);
        int min= SafeInput.getRangedInt(in, "Minute: ", 1, 59);
        System.out.println(year+ " - " +month+ " - " +day+ " - " +hour+ " : " +min );
    }
}
