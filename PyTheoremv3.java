//Daniel Boktor
// 9/28/22
// This program calculates the hypotenuse value for a right triangle with randomly generated side lenghths

public class PyTheoremv3{
    public static void main(String[] args){
        //variable definitions
        int side1A = (int)(Math.random()*(22-5) +5);
        int side1B = (int)(Math.random()*(22-5) +5);
        int side2A = (int)(Math.random()*(22-5) +5);
        int side2B = (int)(Math.random()*(22-5) +5);
        //calculations
        double hypt1 = Math.sqrt(Math.pow(side1A, 2) + Math.pow(side1B,2));
        double hypt2 = Math.sqrt(Math.pow(side2A, 2) + Math.pow(side2B,2));
        //print statements
        System.out.println("Triangle 1          Side1: " + side1A +    "        Side 2: " + side1B + "      Hypotenuse: " + hypt1);
        System.out.println("Triangle 2          Side1: " + side2A +    "        Side 2: " + side2B + "      Hypotenuse: " + hypt2);
    }
}