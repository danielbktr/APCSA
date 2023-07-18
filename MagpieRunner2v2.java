
/**
 * A simple class to run the Magpie class.

 * Code adapted from work by Laurie White for the College Board.
 *
 * Daniel Boktor
 * @2/19/23 
 */

import java.util.Scanner;

public class MagpieRunner2v2
{

    /**
     * Create a Magpie, give it user input, and print its replies.
     */
    public static void main(String[] args)
    {
        Magpie2v2 maggie = new Magpie2v2();

        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.equals("Bye"))
        {
            System.out.println (maggie.getResponse(statement));
            statement = in.nextLine();
        }
        in.close();
    }

}
