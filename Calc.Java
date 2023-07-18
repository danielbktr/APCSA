//Daniel Boktor
//09/28/22
//This program performs different calculations regarding a chosen value

public class Calc{
    public static void main(String[] args){
        int value = 49;
        //calculations
        int divBy2 = value/2;
        int remainderBy2 = value%2;
        double decimalValue = (double)value/2;

        //calculations
        System.out.println("The original value is: " + (value));
        System.out.println("When " + (value) + " is divided by 2, the whole number result is " + (divBy2));
        System.out.println("The remainder of " + (value) + " divided by 2 is "+ remainderBy2);
        System.out.println("When " + (value) + " is divided by 2, the decimal result is " + decimalValue);
    }
}