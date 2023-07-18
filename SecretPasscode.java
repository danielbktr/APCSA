// Program made by Daniel Boktor on 12/28/22
// This program generates a randomized password of ASCII characters of a user-determined length

import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;

public class SecretPasscode{
    public static void main(String[] args) throws IOException{

    //Declarations outside the while loop
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    File fileName=  new File("NewPassword.txt"); 
    PrintWriter newFile = new PrintWriter(fileName);

    

REPEAT: // I used nested while loops later on, so I used a label to clarify to Java which while loop to break or continue to.
    while(true){
        //Declarations that have to be in the while loop
        Integer pwLength = 0;
        int temp = 0;
        String password =  "";

        //Determines number of characters
        while(true){
            try{
                System.out.println("How many characters would you like your password to be? (6 minimum)");
                pwLength = input.nextInt();
            } catch(java.util.InputMismatchException e){
                System.out.println("Invalid entry. Please try again");
                continue;
            } if ((pwLength < 6)){
                System.out.println("Invalid entry. Please try again");
                continue;
            } if(pwLength >= 6){
                break;
            }
            }
        


        //Add characters to passwords
        for (int i =0; i <pwLength; i++){
            temp = random.nextInt(74) + 48; 
            while((temp > 57 && temp < 65) || (temp > 90 && temp < 97)){
                temp = random.nextInt(74) + 48;
            } 
        password += (char)temp;
        }
        System.out.println(password);

        newFile.println(password);

        //Continue password generation
        while(true){
            System.out.println("Would you like to generate another password? (y/n)");
            String continueYN = input.next();
            if(continueYN.equals("y")){
                continue REPEAT;
            } else if(continueYN.equals("n")){
                System.out.println("Have a nice day! \n");
                break REPEAT;
            } else{
                System.out.println("Sorry, please enter a 'y' or an 'n' ");
                continue;
            }
        }
    }
    newFile.close();
    //Read all current passwords
    Scanner fileReader = new Scanner(fileName);
    System.out.println("Passwords:");
    while(fileReader.hasNext()){
        System.out.println(fileReader.nextLine());
    }
    System.out.println("\n");

    fileReader.close();
    input.close();    
    }
}
