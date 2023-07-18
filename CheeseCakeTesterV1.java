/**
 * @purpose
 *
 * @Daniel Boktor 
 * @02/20/23
 *
 */

import java.util.ArrayList;

public class CheeseCakeTesterV1
{
    public static void main(String[] args)
    {
        CheeseCakeV1 temp1 = new CheeseCakeV1("Orange", 4);
        CheeseCakeV1 temp2 = new CheeseCakeV1("Blueberry", 3);
        CheeseCakeV1 temp3 = new CheeseCakeV1("Cherry", 2);
        CheeseCakeV1 temp4 = new CheeseCakeV1("Strawberry", 4);
        CheeseCakeV1 temp5 = new CheeseCakeV1("Lemon", 5);
        CheeseCakeV1 temp6 = new CheeseCakeV1("Plain", 1);
        //initializing and declareing an ArrayList and adding in objects as elements
        ArrayList<CheeseCakeV1> cake = new ArrayList<CheeseCakeV1>();
            cake.add(temp1);
            cake.add(temp2);
            cake.add(temp3);
            cake.add(temp4);
            cake.add(temp5);
            cake.add(temp6);    
        
        //calls several method for each object to perform calculations
        for(CheeseCakeV1 dataRecord : cake)
        {
                dataRecord.calcTotalServings();
                dataRecord.calcCreamCheese();
                dataRecord.calcVanilla();
                dataRecord.calcSugar();
        }
        
        //printing the format of the table
        System.out.println("|       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println("| Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println("|-------|----------|---------------|--------------|----------|-----------|-----------|");

    //     //using a for loop to print out the objects' data
        for(int index = 0; index < cake.size(); index ++)
        {
            System.out.println( String.format("%8h", index) + (cake.get(index)).toString());
        }
    }

}
