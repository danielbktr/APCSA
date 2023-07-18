/* This program was made by Daniel Boktor on 11/29/22. 
The purpose of this program is to take a persons height and weight as input and print their BMI
*/

 
import java.util.Scanner;
import java.lang.Math;
public class BodyMassIndexv2{
        public static void main(String[ ] args){
            Scanner input = new Scanner(System.in);
        
            System.out.println("Please enter your first and last name separated by a space: ");
            String fullName = input.nextLine();

            System.out.println("Please enter your height in feet and inches: ");
            String height = input.nextLine();

            System.out.println("Please enter your weight in pounds(1 pound = .454kg).");
            Double weight = input.nextDouble();
        
            int heightInInches = (12*(Integer.parseInt(height.substring(0,1))) + Integer.parseInt(height.substring(2)));
            double heightInMeters = ((int)((heightInInches/39.4)*100)/100.0);
            // double heightInMetersSquared = Math.pow(heightInMeters,2);
            double weightInKilograms = ((int)((weight/2.2)*100 )/ 100.0);
            // double BMI = (weightInKilograms / heightInMetersSquared);
            // double BMIRounded = ((int)(BMI *100 )/100.0);

            double bMIImperial = ((703*weight) /Math.pow(heightInInches,2));

            
            System.out.println("============================================");
            System.out.println("Name: "+ fullName);
            System.out.println("Height (m): " + heightInMeters);
            System.out.println("Weight (kg): " + weightInKilograms);
            System.out.println("BMI:" + bMIImperial);
            if(bMIImperial < 18.5){
                System.out.println("Category: Underweight");
            }
            else if(bMIImperial <24.9){
                System.out.println("Category: Healthy");
            }
            else if(bMIImperial < 29.9){
                System.out.println("Category: Overweight");
            }
            else {
                System.out.println("Category: Obese");
            }
            System.out.println("============================================");
            input.close();
        }
 }