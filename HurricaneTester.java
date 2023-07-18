/**
 * Hurricane tester class to use on 
 * Daniel Boktor
 *
 */
 
import java.io.IOException;
// import java.io.PrintWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class HurricaneTester{


    public static void main(String[] args) throws IOException
    {
        //read data from text file & put in an array
        File fileName = new File("hurricanedata.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;
        
        //count number of lines in text file
        while (inFile.hasNextLine() )
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();
        




        //initialize arrays based on lines counted in text file
        int [] years = new int[numValues];
        String [] months = new String[numValues];
        int [] pressures = new int[numValues];
        double [] windSpeeds = new double[numValues];
        String [] names = new String[numValues];

        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while(inFile.hasNext()){
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;
        }
        inFile.close();
        
        ArrayList<Hurricane> newList = new ArrayList<Hurricane>(167); //I created an arraylist early because I found that using nonstatic methods made things simpler.
        //convert the windspeed, determine categories, calculate sums
        for (int i=0; i<(numValues-1); i++){
            Hurricane temp = new Hurricane(years[i], names[i], months[i], pressures[i], windSpeeds[i]); // I had to create a new constructor for this.
            temp.convertToMph();
            temp.calculateCat();
            newList.add(i, temp);
        }
        
        // user prompted for range of years
        Scanner inputs = new Scanner(System.in);
        System.out.println("Which years do you want hurricane data on (separated by a space)?");
        String desiredYear = inputs.nextLine();
        inputs.close();

        String[] desiredList = desiredYear.split(" ");
        int maxYear = Integer.parseInt(desiredList[1]);
        int minYear = Integer.parseInt(desiredList[0]);
        int cat1 = 0;
        int cat2 = 0;
        int cat3 = 0;
        int cat4 = 0;
        int cat5 = 0;
        int MinCat = Integer.MAX_VALUE;
        int MaxCat = Integer.MIN_VALUE;
        double MinSpeed = (Integer.MAX_VALUE* 1.0);
        double MaxSpeed =  (Integer.MIN_VALUE*1.0);
        int MinPres = Integer.MAX_VALUE;
        int MaxPres = Integer.MIN_VALUE;
        

        double meanCat = 0.0;
        double meanSpeed = 0.0;
        double meanPres = 0.0;
        int subsetNum = 0;
        for (int i=0; i<(numValues-1); i++){
            if ((newList.get(i).getYear() < maxYear )&& ((newList.get(i)).getYear()> minYear)){
                subsetNum ++;
                meanCat += newList.get(i).getCat();
                meanSpeed += newList.get(i).getWindspeed();
                meanPres += newList.get(i).getPressure();
                if (MaxCat < newList.get(i).getCat()) //Max setter
                    MaxCat = newList.get(i).getCat();
                else if (MinCat > newList.get(i).getCat()) //Min Setter
                    MinCat = newList.get(i).getCat();    
                
                if (MaxSpeed < newList.get(i).getWindspeed()) //Max setter
                    MaxSpeed= newList.get(i).getWindspeed();
                else if (MinSpeed > newList.get(i).getWindspeed()) //Min setter
                    MinSpeed = newList.get(i).getWindspeed();

                if (MaxPres < newList.get(i).getPressure()) //Max Setter
                    MaxPres = newList.get(i).getPressure();
                else if (MinPres > newList.get(i).getPressure()) //Min Setter
                    MinPres = newList.get(i).getPressure();

                if (newList.get(i).getCat() == 1)
                    cat1++;
                if (newList.get(i).getCat() == 2)
                    cat2++;
                if (newList.get(i).getCat() == 3)
                    cat3++;
                if (newList.get(i).getCat() == 4)
                    cat4++;
                    if (newList.get(i).getCat() == 5)
                    cat5++;
            }
        }
        meanCat /= subsetNum;
        meanSpeed /= subsetNum;
        meanPres /= subsetNum;
        System.out.printf("%6s %12s %12s %12s %12s %12s", "Year", "Name", "Month", "Category", "Pressure", "Windspeed");      
        System.out.println();
        for (int i=0; i<(numValues-1); i++){
            System.out.println(newList.get(i).toString());
        }
        System.out.println();
        System.out.printf("                             Average %8.2f %12.2f %12.2f", meanCat, meanPres, meanSpeed);
        System.out.println();
        System.out.printf("                             Minimum %8d %12d %12.2f", MinCat, MinPres, MinSpeed);
        System.out.println();
        System.out.printf("                             Maximum %8d %12d %12.2f", MaxCat, MaxPres, MaxSpeed);
        System.out.println("\nSummary of Categories:");
        System.out.printf("# of category 1 hurricanes: %4d", cat1);
        System.out.println();
        System.out.printf("# of category 2 hurricanes: %4d",  cat2);
        System.out.println();
        System.out.printf("# of category 3 hurricanes: %4d",  cat3);
        System.out.println();
        System.out.printf("# of category 4 hurricanes: %4d", cat4);
        System.out.println();
        System.out.printf("# of category 5 hurricanes: %4d", cat5);

        

     }
}