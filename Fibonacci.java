// Made by Daniel Boktor on April 25, 2023 to calculate the Fibonacci sequence 
import java.util.*;

public class Fibonacci {

    public static void main(String args[]) {
        Scanner inputs = new Scanner(System.in);
        while (true){
            
            System.out.println("What number would you like to input into the fibonacci sequence?");
            String inputInt = inputs.nextLine();
            int inputParsedInt = 0;
            inputParsedInt = Integer.parseInt(inputInt);
            System.out.println(Sequence(inputParsedInt));
            System.out.println("Continue? (Y/N)");
            String continueStr = inputs.nextLine();
            if (continueStr.equals("Y")){
                continue;
            }
            else{
                break;
            }
            
        }inputs.close();
    }
    
    public static int Sequence(int n){
        if (n<=1){
            return n;
        }
        else{
            return (Sequence(n-1)+Sequence(n-2));
        }
    }
    
}
