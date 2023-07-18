//Made by Daniel Boktor 12/12/22. 
//This program reads text datafiles and processes them for statistics on the children of families.
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class FamilyStructurev3 {

    public static void main(String[] args) throws IOException
    {
        int familyCount = 0;
        int oneBOneG = 0;
        int twoGirls = 0;
        int twoBoys = 0;

        File fileName = new File("familyMembers.txt");
        Scanner fileContent = new Scanner(fileName);
        String token = "";
        while(fileContent.hasNext()){
            token = fileContent.next(); 
            familyCount++;
            if ((token.equals("GB")) || (token.equals("BG"))){
                oneBOneG ++;
            }
            else if(token.equals("GG")){
                twoGirls ++;
            }
            else if(token.equals("BB")){
                twoBoys ++;
            }
            else{
                System.out.println("File has invalid values.");
            }
        }
        Double allBoyPercentage =  (int)(((double)twoBoys/ familyCount)*100 + 0.5)/100.0;
        Double allGirlPercentage =  (int)(((double)twoGirls/ familyCount)*100 + 0.5)/100.0;
                Double mixPercentage = (int)(((double)oneBOneG/ familyCount)*100 + 0.5)/100.0; 
        System.out.println("Total number of families: "+ familyCount);
        System.out.println("Number of families with 2 boys: "+ twoBoys + " represents: " + allBoyPercentage);
        System.out.println("Number of families with 2 girls: "+ twoGirls + " represents: " + allGirlPercentage);
        System.out.println("Number of families with a boy and girl: "+ oneBOneG + " represents: " + mixPercentage);
        fileContent.close();
    fileContent.close();
    }
}
