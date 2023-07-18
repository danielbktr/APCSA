// Made by Daniel Boktor on 02/11/23
// This is a tester class for the Car class made for the same assignment

public class CarTester{
    public static void main(String args[]){
        Car tesla = new Car("blue", 16000, 19000, 2019);
        Car prius = new Car("white", 22100, 25000, 2015);
        Car ram = new Car("red", 54988,65000, 2018);
        Car challenger = new Car("black", 35510, 40000, 2017);
        Car rav4= new Car("Blue", 16798, 20000, 2014);

        Car[] carArray = {tesla, prius, ram, challenger, rav4};

        System.out.printf("%-7s%-15s%-15s%-15s%-15s" ,"Color",   "Current Worth",  "Lot Worth", "Average Worth", "Year Made");
        System.out.println();
        System.out.println("=========================================================================");
        for (Car tempCar:carArray){
            tempCar.setAverages();
            System.out.println(tempCar.returnString());
        }
}
}