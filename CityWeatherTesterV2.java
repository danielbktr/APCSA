/**
 * Annual Weather client class
 * 
 * @author APCS Team
 * @version Today
 */
import java.util.Scanner;
public class CityWeatherTesterV2
{
    
   
    
    // method to print results (formatting output will be done in 6.02)
    
        //Output: display table of weather data including average and total
        //System.out.println();
        //System.out.println("           Weather Data");
        //System.out.println("      Location: " + city +", " + state);
        //System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        //System.out.println();
        //System.out.println("***************************************************");
        //for( int index = 0; index < temperature.length; index++)
        //{
  		// use printf to format
        //}
        //System.out.println("Average: " + "    Total: ");
        
        
   
    
    public static void main (String [ ] args)
    {

        Scanner in = new Scanner(System.in);  //will be used in 6.02
        String city = "Orlando";  //choose a city from the table provided
        String state = "Florida";  //choose a city from the table provided
  
        String [] month = {"Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};     //complete initialization of months array
        double [] temperature ={60.9, 62.6, 67.4, 71.5, 77.1, 81.2, 82.4, 82.5, 81.1, 75.3, 68.8, 63.0};     //complete initialization of temperatures array
        double [] precipitation ={2.4, 2.4, 3.5, 2.4, 3.7, 7.4, 7.2, 6.3, 5.8, 2.7, 2.3, 2.3};     //complete initialization of precipitation array
    
        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in
       

        System.out.println("Would you prefer Farenheit or Celsius?(F or C)");
        String tempPreference = in.nextLine();
        System.out.println("Would you prefer inches or centimeters?(In or Cm)");
        String lengthPreference = in.nextLine();


        CityWeatherV2 orlando = new CityWeatherV2(month, temperature, precipitation);

        if(tempPreference.equalsIgnoreCase("C")){
            orlando.fToC();
         }
        if(lengthPreference.equalsIgnoreCase("cm")){
            orlando.inToCm();
            }

        orlando.printData(city, state, tempLabel, precipLabel, orlando);    

        in.close();
    }//end main
}//end class

