/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Daniel Boktor
 * @version 09/21/22   
 */
public class CurrencyV2
{
    public static void main(String[] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;		// starting US Dollars

        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 20.06;     // 1 US dollar = 19.57852 Pesos
        double dollarsSpentInMexico = 0.0;      // US dollars spent in Mexico
        double dollarsAfterMexico = 0.0;        // US dollars remaining after Mexico
        //remaining variables below here
		double egyptianPoundConversion = 19.49; // 1 USD = 19.49
		double poundsSpent= 70055.44; // Egyptian pounds spent
		double dollarsSpentinEgypt = 0.0; // 3594.43 USD spent in egypt
		double dollarsAfterEgypt = 0.0; // 2546.14 USD leftover after Egypt
		double yenToUsdConversion = 144.75; // 1USD = 144.75 Japanese yen
		double yenSpent = 304098.04; // Japanese Yen spent 
		double dollarsSpentInJapan = 0.0; // 2100.85 USD spent in Japan
		double dollarsAfterJapan = 0.0; // 445.29 USD leftover after Japan

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\n");

        // Conversion
        // code goes below here
		System.out.println("Starting US dollars:		" + (startingUsDollars));
		//Mexico
		System.out.println("Mexico:");
		System.out.println("Pesos spent:			" + (pesosSpent));
		dollarsSpentInMexico = (pesosSpent/pesoExchangeRate);
		System.out.println("US dollars equivalent:		" + (dollarsSpentInMexico));
		dollarsAfterMexico = (startingUsDollars - dollarsSpentInMexico);
		System.out.println("US dollars remaining:		" + (dollarsAfterMexico));

		System.out.println("\n");  //Spacing between spending amounts
		//egypt
		System.out.println("Egypt:");
		System.out.println("Pounds spent:			" + (poundsSpent));
		dollarsSpentinEgypt = (poundsSpent / egyptianPoundConversion);
		System.out.println("US dollars equivalent:		" + (dollarsSpentinEgypt));
		dollarsAfterEgypt = (dollarsAfterMexico - dollarsSpentinEgypt);
		System.out.println("US dollars remaining:		" + (dollarsAfterEgypt));
		
		System.out.println("\n");  //Spacing between spending amounts

		//Japan
		System.out.println("Japan: ");
		System.out.println("Yen Spent:		" + yenSpent);
		dollarsSpentInJapan = (yenSpent/yenToUsdConversion);
		System.out.println("US dollars equivalent:		" + (dollarsSpentInJapan));
		dollarsAfterJapan =( dollarsAfterEgypt - dollarsSpentInJapan);
		System.out.println("US dollars remaining:		" + (dollarsAfterJapan));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Remaining US dollars:"		);
		System.out.println("\n");

        // Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n");

		//Calculations for Souvenir #1
		int costItem1 = 40;  						//cost per item of first souvenir
		int budget1 = 1065;   						//budget for first item
		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		int totalItems1 = (budget1/costItem1);
		System.out.println("   Total items purchased: " +  totalItems1);
		int fundsRemaining1 = (budget1%costItem1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);
     	System.out.println("\n");

		//Calculations for Souvenir #2
		double costItem2 = 29.99;  						//cost per item of second souvenir
		int budget2 = 500;   							//budget for second item
		int totalItems2 = (int) (budget2/costItem2); 	//how many items can be purchased
		double fundsRemaining2 = (budget2%costItem2);  	//how much of the budget is left
		// use modulus instead of multip/division


		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItems2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

