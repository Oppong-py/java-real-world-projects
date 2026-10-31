import java.util.Scanner;
import java.util.InputMismatchException;
public class Bill {
    public static void main(String[] args) {
        //initialising the scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        //displaying the welcome message
        System.out.println("=== Welcome to the Smart Tip & Bill Splitter Calculator ===");

        //declaring and initialising the variables
        double billAmount = 0d;
        double billPercentage = 0d;
        int numberOfPeople = 0;

        //try and catch block for accepting user input for bill amount 
        //and bill percentage

        while(true){

            try{
                System.out.print("Please enter the total bill amount: ");
                billAmount = scanner.nextDouble();
                System.out.print("Please enter the tip percentage: ");
                billPercentage = scanner.nextDouble();
                System.out.print("How many people are splitting the bill? ");
                numberOfPeople = scanner.nextInt();

                if(numberOfPeople > 0 && billAmount > 0 && billPercentage > 0){
                    break;

                }else{System.out.println("Invalid input. Number must be greater than 0. Please try again.");
                
                }
            } catch(InputMismatchException e){
                System.out.println("Invalid input. Enter a whole number");
                scanner.nextLine();

            }

        }
    
        double tipAmount = (billPercentage / 100) * billAmount;
        double grandTotal = billAmount + tipAmount;
        double amountPerPerson = grandTotal / numberOfPeople;

        System.out.println("=============================================");
        System.out.println("           BILL SUMMARY & SPLIT");
        System.out.println("=============================================");
        System.out.println("Original Bill Amount:  $" + String.format("%.2f", billAmount));
        System.out.println("Tip Percentage:        " + String.format("%.1f", billPercentage) + "%");
        System.out.println("Tip Amount:            $" + String.format("%.2f", tipAmount));
        System.out.println("---------------------------------------------");
        System.out.println("Grand Total:           $" + String.format("%.2f", grandTotal));
        System.out.println("Amount Per Person:     $" + String.format("%.2f", amountPerPerson));
        System.out.println("=============================================");
        System.out.println("Each person pays:      $" + String.format("%.2f", amountPerPerson));
        System.out.println("=============================================");



        scanner.close();


    }












    
}
