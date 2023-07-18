// Made by Daniel Boktor on 02/11/23 
// This program is a class for a Car object with 5 attributes, with one of them being created 
// from the other attributes
public class Car {
    private String color;
    private int worth;
    private int oldWorth;
    private int year;
    private double avgWorth;

    public Car(String newColor, int newOldWorth, int newWorth, int newYear){
        color = newColor;
        oldWorth = newOldWorth;
        worth = newWorth;
        year = newYear;
    }


    public void setColor(String newColor){ //returns the object's color
        color = newColor;
    }
    public void setWorth(int newWorth){ //returns the object's worth
        worth = newWorth;
    }
    public void setOldWorth(int newOldWorth){ //returns the object's worth
        oldWorth = newOldWorth;
    }
    public  void setYear(int newYear){//sets the object's year
        year = newYear;
    }



    public String getColor(){ //returns the object's color
        return color;
    }
    public int getWorth(){//returns the object's worth
        return worth;
    }
    public int getYear(){//returns the object's year
        return year;
    }
    public int getOldWorth(){
        return oldWorth;
    }
    public double getAvgWorth(){
        return avgWorth;
    }

    public void setAverages(){
        avgWorth = ((getWorth() + getOldWorth())/2);
    }

    public  String returnString(){
        String objValues1=  String.format("%-7s",getColor());
        String objValues2 = String.format("%-15d",getWorth());
        String objValues3 = String.format("%-15d",getOldWorth());
        String objValues4 = String.format("%-15.2f",getAvgWorth());
        String objValues5 = String.format("%-15d",Integer.valueOf(getYear()));
        // objValues = objValues + " "+  Integer.valueOf(getYear());
        return (objValues1+objValues2+objValues3+objValues4 + objValues5);
    }
    public static void main(String args[]){}
}