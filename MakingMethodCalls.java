/**
 * Edited by Daniel Boktor on 10/22/22
 * The purpose of this program is to demonstrate good method usage and understanding.
 */
 public class MakingMethodCalls

{
    public static void addTheseTwo()
    {
        System.out.println("Ten plus five equals " + (10 + 5));
    }   
    
    public static void multiplyTheseTwo(int a, int b)
    {
        System.out.println("Ten times five equals " + (a * b));
    }  
    
    public static int divideTheseTwo(int a, int b)
    {
        return (a / b);
    }    
    
    public static void main(String[] args)
    {
        int x = 10;
        int y = 5;
        
        /**
         * Insert code here that calls one of the above methods that results in.
         * computer printing out "Ten plus five equals 15"
         */
        addTheseTwo();


        /**
         * Insert code here that calls one of the above methods that results in.
         * computer printing out "Ten times five equals 50"
         */
        multiplyTheseTwo(x, y);

        
        
        /**
         * Insert code here that calls one of the above methods that results in.
         * computer printing out "Ten divided by five equals 2"
         */
        System.out.println("Ten divided by five equals " + divideTheseTwo(x, y));

    }//end of main method
}//end of class
