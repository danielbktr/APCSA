/* Made by Daniel Boktor on 10/22/22
 * The program exists in order to calculate product purchasing costs, specifically cars.
 */
import java.util.Scanner; //imports the Java Scanner class
public class CarPurchase
{
    public static void main(String[] args){

        //This entire section of code exists to gather data for the receipt using inputs and scanners.
        Scanner questions = new Scanner(System.in); // creates a scanner instance
        
        System.out.println("Please Enter your first and last name separated by a space: ");// These two lines get the customer's legal first and last name.
        String buyerName = questions.nextLine();

        System.out.println("Please input today's date in an MM/DD/YYYY format.");
        String dateToday = questions.nextLine();
        
        System.out.println("What model of car would you like to purchase? "); // These two lines get the customer's desired model of car.
        String itemChoice = questions.nextLine();
        
        System.out.println("What color of this model would you like to purchase? ");// These two lines get the customer's desired color of car.
        String carColor = questions.nextLine();
        
        System.out.println("How many cars of this model would you like? "); // These two lines get the customer's desired number of cars.
        String carCount = questions.nextLine();
        
        System.out.println("What is the price of this car? ");// These two lines get the customer's car's price
        String carPrice = questions.nextLine();
        
        System.out.println("Please enter your 12-digit credit/debit card number: "); // These two lines get the customer's payment information.
        String cardNumber = questions.nextLine();



        //This section of code is where the values that must be parsed are parsed.
        Integer carCountInt = (Integer.parseInt(carCount));
        double carPriceDouble = Double.parseDouble(carPrice);


        //Calculations and data polishing begins here.
        String lastFourDigits = cardNumber.substring(9);
        int spaceIndex = buyerName.indexOf(" ");
        String lastName = buyerName.substring(spaceIndex+1);
        char firstInitial = buyerName.charAt(0);
        
        String orderNumber = firstInitial + lastFourDigits + itemChoice;

        //This is where printing begins.
        System.out.println("**************************************************");
        System.out.println("Receipt for Car Purchase");
        System.out.println(dateToday.substring(0,2) + "-"+ dateToday.substring(3,5)+ "-"+dateToday.substring(6));
        System.out.println("Order Number: "+ orderNumber);
        System.out.println("\n");
        System.out.println(firstInitial+". "+ lastName);
        System.out.println("Car: "+ itemChoice);
        System.out.println("Car Color: " + carColor);
        System.out.println("Total Price: " + (carPriceDouble*carCountInt));
        System.out.println("Account: #####-###-" + lastFourDigits);
        System.out.println("Enjoy your new car, and drive safe!");
        for (int i=1; i==100; i++){
            System.out.print("*_");
        }
        questions.close();
    }
}
