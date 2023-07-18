
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @ author: Daniel Boktor
 * @ 09/08/22
 * This program demonstrates various java mathematical operations using 
 * doubles, known as decimals in math, and whole numbers known as integers 
 * in both math and programming.
 */
 public class CalculationsV6V2
{
    public static void main(String[ ] args){
        // int variable declaration
        int inum25 = 25;
        int inum9 = 9;
        int inum11 = 11;

        // double variable declaration
        double inumtenpoint0 = 10.0;
        double inumpi = 3.14;
        double inum4321 = 43.21;

        //personal doubles
        double inum10point8 = 10.8;
        double inum4point6 = 4.6;
        double inum2point4 = 2.4;

        // Addition
        System.out.println("Addition");
        System.out.println(inum25 + " + " + inum9  + " = " + (inum25 + inum9) );
        System.out.println(inum4321 + " + " + inumpi + " = " +   (43.21 + 3.14));
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(inum11 + " - " +inum9 + " - "+ inum25 + " = " + (inum11 - inum9 - inum25 ));
        System.out.println(inumpi +   " - " +  inumtenpoint0 + " = "  +( 3.14 - 10.0) );
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(inum25 +" * " + inum9 + " = " +  (inum25 * inum9) ); 
        System.out.println(inumpi + " * " +  inumtenpoint0 + " * " +  inumtenpoint0+ " = " + (3.14 * 10.0 * 10.0) );
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(inum9+  " / " + inum25 + "="  + (inum9 / inum25) );
        System.out.println(inum4321 + " / " + inumtenpoint0+ " = " + (43.21 / 10.0) );
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(inum11 + " % "+  inum9 +" = " +  (inum11 % inum9) );
        System.out.println(inumtenpoint0 + " % " + inumpi + " = " + (10.0 % 3.14) );
        System.out.println();
        
        // 1.08 Additional int Equations
        System.out.println("Additional Equations");
        System.out.println(inum11 + " + " +  inum9 + " = " + (inum11 + inum9));
        System.out.println(inum25+" / "+inum9 +" = " + (inum25 / inum9));
        System.out.println(inum11 + " - "+ inum9 + " = " + (inum11 - inum9));
        System.out.println();
        
        // 1.09 double equations
        System.out.println("Additional Double Equations");
        System.out.println(inum10point8 + " * " + inum10point8 + " = " +(inum10point8*inum10point8) );
        System.out.println(inum4point6 + " / " + inum2point4 + " = " + (inum4point6/inum2point4));
        System.out.println(inum10point8 + " % "+ inum2point4 + " = " + (inum10point8%inum2point4));
    } // end of main method
} // end of class
