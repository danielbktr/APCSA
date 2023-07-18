// Made by Daniel Boktor on Jan 15 2022 to create a class with attributes and methods.
public class DogV3V2{ 

    //constructor
    public DogV3V2(){}
    public DogV3V2(char c, String string, int i, String string2){}
    public void clipNails(Boolean anxious){
        if (anxious){
            System.out.println("You've been bitten!"); }
            if (!(anxious)){
                System.out.println("Your dog's nails have been clipped.");
            }
    }
    public void bark(Boolean volume, Boolean pitch){
        if (volume && pitch){
            System.out.println("YIP!");
        }
        if ((!(volume))&& pitch){
            System.out.println("yip");
        }
        if (volume && (!(pitch))){
            System.out.println("BARK!");
        }
        if ((!(volume)) && (!(pitch))){
            System.out.println("bark");
        }
    }// end bark
}//end class