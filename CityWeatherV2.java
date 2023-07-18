/**
 * Annual Weather object class
 * 
 * @author APCS Team + Daniel Boktor
 * @version Today
 */
import java.lang.Math;
public class CityWeatherV2 {

    private  String[] month;
    private  double[] temperature;
    private double[] precipitation; 

    public CityWeatherV2(String[] m, double[] temp, double[] precip){ //consstructor
        month = m;
        temperature = temp;
        precipitation = precip;
        }


    public String[] getMonth(){
        return month;
            }
    public double[] getTemp(){
        return temperature;
            }
    public double[] getPrecipitation(){
        return precipitation;
            }
    
    public void setMonth(String m, int index){
        month[index] = m; 
            }
    public void setTemperature(double t, int index){
        temperature[index] = t; 
            }
    public void setPreciptation(double p, int index){
        precipitation[index] = p; 
            }

    public double avgTemperature(){
        double summedTemperature = 0.0;
        for (int i = (temperature.length-1); i>=0; i--){
            summedTemperature += temperature[i];
            }
        double avgTemperatureF = (summedTemperature/(temperature.length));        
        return avgTemperatureF;
        }
    public double totalPrecipitation(){
        double summedPrecipitationIn = 0.0;
        for(int i = precipitation.length -1; i>=0; i--){
            summedPrecipitationIn += precipitation[i];
            }
        return summedPrecipitationIn;
        }
    public void fToC(){
        for (int i = (temperature.length-1); i>=0; i--){
            temperature[i] = ((temperature[i]-32)/1.8); 
            }
        }
    public void inToCm(){
        for (int i = (precipitation.length-1); i>=0; i--){
            precipitation[i] = precipitation[i]*2.54; 
            } 
        }
    public void printData(String city, String state, String tempLabel, String precipLabel, CityWeatherV2 obj){
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("***************************************************");
        for( int i = 0; i < temperature.length; i++){
            System.out.printf("%-15s %-18.1f %-15.1f%n", month[i], temperature[i], precipitation[i]);
            }
            System.out.println("***************************************************");    
        System.out.println("Average: "+ ((double)Math.round(obj.avgTemperature()*10)/10) + "    Total: "+ ((double)Math.round(obj.totalPrecipitation()*10)/10));
        }    
    }






// Create (instantiate) an object to represent a city’s annual weather data for one year.
// Print out the average temperature and total precipitation to test the methods you created in CityWeatherV1.
// When you complete this assignment, save it. You will continue making modifications to it in the next lesson. It will be turned in for a grade at that time.