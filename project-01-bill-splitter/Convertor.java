import java.util.Scanner;
public class Convertor {
    public static void main(String[] args){
        do{
            System.out.println("SELECT AN OPTION FROM THE MENU BELOW");
            System.out.println("1. Currency Conversion");
            System.out.println("2. Temperature Conversion");
            System.out.print("3. Exit\n\n");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            switch(choice){

                case 1:
                    System.out.println("SELECT A MODE OF CONVERSION");
                    System.out.println("1. USD to EUR");
                    System.out.println("2. EUR to USD\n\n");
                    break;



                case 2:
                    System.out.println("SELECT A MODE OF CONVERSION");
                    System.out.println("1. C to F");
                    System.out.print("2. F to C\n\n");
                    break;







            }

        }while(true);







    }
    
    public double convCurr_U_to_E(double valUSD){
        final double conversionRate = 0.92;
        double valEUR = valUSD * conversionRate;
        return valEUR;

    }

     public double convCurr_E_to_U(double valEUR){
        final double conversionRate = 1.09;
        double valUSD = valEUR * conversionRate;
        return valUSD;

     }

    public double convTemp_C_to_F(double valC){
        final double conversionRate = 9/5;
        double valF = (valC * conversionRate) + 32;
        return valF;

    }

    public double convTemp_F_to_C(double valF){
        final double conversionRate = 5/9;
        double valC = (valF - 32) * conversionRate;
        return valC;

    }










}
