/* This program was made by Daniel Boktor on 12/4/22. 
*This program attempts to roughly calculate someone's total daily energy expenditure
 */
import java.util.Scanner;
public class TDEEv2 {
    public static void main(String[ ] args){
        Scanner inputs = new Scanner(System.in);

        System.out.println("What is your first and last name separated by a space? ");
        String fullName = inputs.nextLine();
        
        System.out.println("What is your BMR? ");
        int BMR = inputs.nextInt();
        inputs.nextLine(); // This line is here because the next question was being skipped. 

        System.out.println("What is your sex(M/F)? ");
        String gender = inputs.nextLine();

        System.out.println("What is your activity level(Please enter as a lowercase letter)? ");
        System.out.println("[A] Resting (Sleeping, reclining)");
        System.out.println("[B] Sedentary (Minimal movement)");
        System.out.println("[C] Light (Office work, sitting)");
        System.out.println("[D] Moderate	(Light manual labor)");
        System.out.println("[E] Very Active (Hard manual labor)");
        System.out.println("[F] Extremely Active (Heavy manual labor)");
        String activityLevel = inputs.nextLine();
        System.out.println("Your Results: ");
        System.out.println("Name: " + fullName);
        System.out.println("Gender: " + gender);
        System.out.println("BMR: " + BMR);
        Double activityFactor = 0.0;
        if ((activityLevel.equalsIgnoreCase("a"))   && (gender.equalsIgnoreCase("m"))){
             activityFactor = 1.0;
        }
        else if((activityLevel.equalsIgnoreCase("b"))  && (gender.equalsIgnoreCase("m"))){
             activityFactor = 1.3;
        }
        else if((activityLevel.equalsIgnoreCase("c"))  && (gender.equalsIgnoreCase("m"))){
             activityFactor = 1.6;
        }
        else if((activityLevel.equalsIgnoreCase("d"))  && (gender.equalsIgnoreCase("m"))){
             activityFactor = 1.7;
        }
        else if((activityLevel.equalsIgnoreCase("e"))  && (gender.equalsIgnoreCase("m"))){
             activityFactor = 2.1;
        }
        else if((activityLevel.equalsIgnoreCase("f"))  && (gender.equalsIgnoreCase("m"))){
             activityFactor = 2.4;
        }
        else if(( activityLevel.equalsIgnoreCase("a"))  && (gender.equalsIgnoreCase("f"))){
             activityFactor = 1.0;
        }
        else if((activityLevel.equalsIgnoreCase("b"))   && (gender.equalsIgnoreCase("M"))){
             activityFactor = 1.3;
        }
        else if((activityLevel.equalsIgnoreCase("c")) && (gender.equalsIgnoreCase("f"))){
             activityFactor = 1.5;
        }
        else if((activityLevel.equalsIgnoreCase("d"))  && (gender.equalsIgnoreCase("f"))){
             activityFactor = 1.6;
        }
        else if((activityLevel.equalsIgnoreCase("e")) && (gender.equalsIgnoreCase("f"))){
             activityFactor = 1.9;
        }
        else if((activityLevel.equalsIgnoreCase("f"))  && (gender.equalsIgnoreCase("f"))){
             activityFactor = 2.2;
        }
        else{
            System.out.println("Your entry for activity level was invalid.");
        }
        System.out.println("Activity Factor: " + activityFactor); 
        Double TDEE = BMR * activityFactor;
        System.out.println("TDEE: " + TDEE + " calories");
        inputs.close();
    }
    
}
