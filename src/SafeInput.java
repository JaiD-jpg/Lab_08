import java.util.Scanner;

public class SafeInput {
    Scanner in= new Scanner(System.in);
    public static String getNonZeroLenString(Scanner pipe, String prompt){
        String retString = "";
        do{
            System.out.println("\n" +prompt+ ": ");
            retString = pipe.nextLine();
        }while(retString.length() == 0);
        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int retVal= 0;
        String thrash= "";
        boolean done= false;
        do{
            System.out.println(prompt);
            if(pipe.hasNextInt()){
                retVal= pipe.nextInt();
                pipe.nextLine(); //fix buffer
                done=true;
            }else{
                thrash = pipe.nextLine();
                System.out.println("You must enter an integer.");
            }
        }while(!done);
        return retVal;
    }

    public static double getDouble(Scanner pipe, String prompt){
        double retVal= 0;
        String thrash= "";
        boolean done=false;
        do{
            retVal= pipe.nextDouble();
            pipe.nextLine();
            done=true;
        }while(!done);
        return retVal;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high){
        int retVal=0;
        String thrash="";
        boolean done=false;
        do{
        System.out.println(prompt + "[" + low + "-" + high + "]");
        if(pipe.hasNextDouble()){
            retVal= pipe.nextInt();
            pipe.nextLine();
            if(retVal >= low && retVal <= high){
                done=true;
            }
            else{
                System.out.println("The number is out of range");
            }
        }
        else{
            thrash= pipe.nextLine(); //clear the buffer
            System.out.println("You must enter a number");
            }
        }while(!done);
        return retVal;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high){
        double retVal=0;
        String thrash= "";
        boolean done= false;
        do{
            System.out.println(prompt + "[" + low + "-" + high + "]");
            if(pipe.hasNextDouble()){
                retVal= pipe.nextDouble();
                pipe.nextLine();
                if(retVal >= low && retVal <= high){
                    done=true;
                }
                else{
                    System.out.println("The number is out of range");
                }
            }
            else{
                thrash= pipe.nextLine(); //clear the buffer
                System.out.println("You must enter a number");
            }
        }while(!done);
        return retVal;
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt){
        boolean retVal= true;
        boolean done= false;
        String response= "";
        do{
            System.out.println(prompt + "[Y/N]");
            response= pipe.nextLine();
            if(response.equalsIgnoreCase("Y")){
                retVal= true;
                done=true;
            }
            else if(response.equalsIgnoreCase("N")){
                retVal=false;
                done=true;
            }
            else{
                System.out.println("You must answer Y or N");
            }
        }while(!done);
        return retVal;
    }
    public static String getRegExString(Scanner pipe, String prompt, String regexPattern){
        String response="";
        boolean done=false;
        do{
            System.out.println(prompt);
            response=pipe.nextLine();
            if(response.matches(regexPattern)){
                done=true;
            }
            else{
                System.out.println("Your input must match "+ regexPattern);
            }
        }while(!done);
        return response;
    }

    public static String prettyHeader(Scanner in, String msg){
        System.out.println("**************************");
        System.out.println("***" + msg + "***");
        System.out.println("**************************");
        return msg;
    }
}