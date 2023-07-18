// Made by Daniel Boktor on 6/20/23 to test the encryption and decryption classes
import java.util.ArrayList;
import java.util.Scanner;

public class CeasarTesterv2 {
    public static void main(String args[]){
        Scanner inputs = new Scanner(System.in);
        while(true){   
            System.out.println("Would you like to encrypt or decrypt a message? ('dec', 'enc', or 'quit')");
            String encOrDec = inputs.nextLine();
            
            if(encOrDec.equalsIgnoreCase("enc")){
                System.out.println("What is your message to be encrypted? ");
                String msg = inputs.nextLine();
                int shiftInt = -11111;
                System.out.println("How much would you like to shift in the alphabet by? ");
                shiftInt = inputs.nextInt();
                ArrayList<String> newAlphabet = Encryptionv2.defineShiftedAlphabet(shiftInt);
                String tempString = Encryptionv2.createCodedMessage(newAlphabet,shiftInt,msg);
                System.out.println("Your new message is: "+ tempString);
            }

            else if (encOrDec.equalsIgnoreCase("dec")){
                System.out.println("What message would you like to decode? ");
                String codedMsg = inputs.nextLine();
                int shiftInt = -11111;
                System.out.println("By what number (0-25) has this message been shifted? ");
                shiftInt = inputs.nextInt();            
                ArrayList<String> newalphabet = Decryptionv2.defineShiftedAlphabet(shiftInt);
                String tempString = Decryptionv2.dceryptCodedMessage(newalphabet, shiftInt, codedMsg);
                System.out.println(tempString);
            }
                else if(encOrDec.equalsIgnoreCase("quit")){
                    break;
                }inputs.nextLine();
            } //while loop
            inputs.close();
        } //main method
        } // class