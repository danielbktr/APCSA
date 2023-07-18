// Made by Daniel Boktor on Jan 15 2022 to create a class with attributes and methods.
public class DogV8v2{ 

    private char gender;
    private String breed;
    private int age;
    private int weight;
    private String name;


    //constructors
    public DogV8v2(){}

    public DogV8v2(char g, String brd, int ageYears, int weightLB){
        gender = g;
        breed = brd;
        age = ageYears;
        weight = weightLB;
    }

    public DogV8v2(char g, String brd, int ageYears,int weightLB, String nameNew){
        gender = g;
        breed = brd;
        age = ageYears;
        weight = weightLB;
        name = nameNew;
    }
    
 
    //getters
    public char getGender(){
        return gender;
    }

    public int getAge(){
        return age;
    }

    public String getBreed(){
        return breed;
    }
    
    public int getWeight(){
        return weight;
    }

    public String getName(){
        return name;
    }



    // setters
    public void setAge(int newAge){
        age = newAge;
    }

    public void setBreed(String newBreed){
        breed= newBreed;
    }

    public void setWeight(int newWeight){
        weight = newWeight;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setGender(char g){
        gender = g;
    }



    // Methods
    public String clipNails(){
        return "Your dog's nails have been clipped.";
    }

    public String clipNails(Boolean anxious){
        String rString = ""; 
        if (anxious){
            rString = ("You've been bitten!"); }
        else if (!(anxious)){
            rString = ("Your dog's nails have been clipped.");
        }
        return rString;
    }

    public String bark(Boolean volume, Boolean pitch){
        String bark = "";
        if (volume && pitch){
            bark = ("YIP!");
        }
        if ((!(volume))&& pitch){
            bark = ("yip");
        }
        if (volume && (!(pitch))){
            bark = ("BARK!");
        }
        if ((!(volume)) && (!(pitch))){
            bark = ("bark");
        }
        return bark;
    }// end bark

}//end class