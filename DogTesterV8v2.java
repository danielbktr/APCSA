public class DogTesterV8v2 {
    
    public static void main(String args[]){

        DogV8v2 cocoa = new DogV8v2();
        DogV8v2 fluffy = new DogV8v2('m', "Chihuahua", 8 , 15);
        DogV8v2 alice = new DogV8v2('f', "Golden Retriever", 12, 80, "Alice");

        fluffy.setName("Fluffy");
        cocoa.setAge(2);
        cocoa.setBreed("German Sheperd");
        cocoa.setGender('f');
        cocoa.setWeight(70);
        cocoa.setName("Cocoa");



        System.out.println("__________________________________________________________________________________");
        System.out.printf("%n%-12s %-12s %-17s %-12s %-12s" ,"Name",   "Gender",  "Breed", "Age", "Weight");
        System.out.printf("%n%-12s %-12c %-17s %-12d %-12d", fluffy.getName(), fluffy.getGender(), fluffy.getBreed(), fluffy.getAge(), fluffy.getWeight());
        System.out.printf("%n%-12s %-12c %-17s %-12d %-12d", cocoa.getName(), cocoa.getGender(), cocoa.getBreed(), cocoa.getAge(), cocoa.getWeight());
        System.out.printf("%n%-12s %-12c %-17s %-12d %-12d", alice.getName(), alice.getGender(), alice.getBreed(), alice.getAge(), alice.getWeight());

    }
    
}
