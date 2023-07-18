
import java.util.Scanner;
public class printTicketv2 {

    public static void printTicketOut(String name, String id, double price){
        System.out.println("Welcome to the APCS Carnival, " + name + "!");
        System.out.println("Your user ID is " + id);
        System.out.println("The cost of your ticket is $" + price +  ".");
        System.out.println("Have a great time at the APCS Carnival today!");
    }
    public static void main(String args[]){
        double price = 0.0;
        Scanner inputs = new Scanner(System.in);

        System.out.println("What's your first and last name? ");
        String fullName = inputs.nextLine();
        System.out.println("How old are you?");
        String ageString  = inputs.nextLine();
        System.out.println("Are you a first responder? (Y or N)");
        String policeStatus = inputs.nextLine();
        System.out.println("Are you a first responder? (Y or N)");
        String veteranStatus = inputs.nextLine();

        int age = Integer.parseInt(ageString);
        String[] temp = fullName.split(" ");
        String firstName = temp[0];
        String lastName = temp[1];

        if (age <= 3){
            price = 2.0;}
        else if(age <= 5 ){
            price = 9.0;}
        else if(age <= 18){
            price = 11.0;}
        else{
            price = 12.0; }
        if(policeStatus.equalsIgnoreCase("y")){
            price /= 2;}
        if(veteranStatus.equalsIgnoreCase("y")){
            price /= 2;}

        char[] tempArray = firstName.toCharArray();
        char firstNameChar = tempArray[0];
        String id = (firstNameChar + lastName + (int)((Math.random() * 900) + 100));

        printTicketOut(fullName, id, price);

        inputs.close();
    }//end main
    
}// end class
