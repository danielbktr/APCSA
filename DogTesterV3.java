import java.util.Scanner;

// Made by Daniel Boktor on Jan 15 2022 to test the class DogV3
public class DogTesterV3{
    static DogV8v2 dog = new DogV8v2();
    static Scanner inputs = new Scanner(System.in);

    public static void main(String args[]){
        Boolean anxiety;
        Boolean volume;
        Boolean pitch;

        System.out.println("Is your dog anxious?(Y or N)");
        String anxious = inputs.nextLine();
        System.out.println("Does your dog have a loud bark?(Y or N)");
        String barkVolume = inputs.nextLine();
        System.out.println("Does your dog have a high pitched bark? (Y or N)");
        String barkPitch = inputs.nextLine();
        
        if (anxious.equalsIgnoreCase("y")){
            anxiety = true;
        }
        else{
            anxiety = false;
        }
        if (barkVolume.equalsIgnoreCase("y")){
            volume = true;
        }
        else{
            volume = false;
        }
        if (barkPitch.equalsIgnoreCase("Y")){
            pitch = true;
        }
        else{
            pitch = false;
        }

        System.out.println("You attempt to clip your dog's nails.");
        dog.clipNails(anxiety);        
        System.out.println("Your dog is barking! Can you hear them?");
        dog.bark(volume, pitch);
    }
}