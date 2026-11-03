public class CtoFTableDisplay {
    public static void main(String[] args){
        for (int Cel=-100; Cel<=100; Cel++){
            double Fah= (Cel*1.8)+32;
            System.out.println("Celsius    Fahrenheit");
            System.out.println(Cel+ "    =    " + Fah);
            System.out.println();
        }
    }
}