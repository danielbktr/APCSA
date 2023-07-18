import java.util.Scanner;
public class PetsTesterv2 {
    public static void main (String [] args){
    Scanner inputs = new Scanner(System.in);
        while (true){
            
            System.out.println("What is your pet's name?");
            String tempName =  inputs.nextLine();
            System.out.println("What is your pet's breed?");
            String tempBreed = inputs.nextLine();
            System.out.println("What is your pet's age? (Wholen numbers only)");
            int tempAge = inputs.nextInt();

            Petsv2 newPet = new Petsv2(tempName, tempBreed, tempAge);

            System.out.printf("%n%-12s %-17s %-12s" ,"Name",  "Breed", "Age");
            System.out.printf("%n%-12s %-17s %-12s  ",newPet.getName(), newPet.getBreed(), newPet.getAge());
            System.out.println("\nWould you like to enter another pet? (Y or N)");
            String continuequestion = inputs.nextLine();
            continuequestion = inputs.nextLine();
            if (continuequestion.equalsIgnoreCase("y")){
                continue;
            }
            else{
                break;
            }
        }//end while
    inputs.close();
    } // end main
} //end class