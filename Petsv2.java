public class Petsv2{
    private String name;
    private String breed;
    private int age;

    public Petsv2(){}
    public Petsv2(String newName, String newBreed, int newAge){
        name = newName;
        breed = newBreed;
        age = newAge;
    }

    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public int getAge(){
        return age;
    }


    public void setName(String newName){
        name = newName;
    }
    public void setBreed(String newBreed){
        breed = newBreed;
    } 
    public void setAge(int newAge){
        age = newAge;
    }

}// end class
