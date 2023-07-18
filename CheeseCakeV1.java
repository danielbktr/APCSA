
// /**
//  * @This is the class file for the CheeseCakeV1 class, later used in the cheesecaketester class.
//  *
//  * @Daniel Boktor
//  * @02/20/23
//  *
//  */
public class CheeseCakeV1
{
    private int myQuantity, myServings, myCreamCheese, myVanilla;
    private double mySugar;
    private String myFlavor;
    
    public CheeseCakeV1(String flavor,int quantity){
        myQuantity = quantity;
        myFlavor = flavor;
    }

    public void calcTotalServings()
    {
        myServings = myQuantity * 16;
    }

    public void calcCreamCheese()
    {
        myCreamCheese = myQuantity  * 32;
    }

    public void calcVanilla()
    {
        myVanilla = myQuantity;

    }

    public void calcSugar()
    {
        mySugar = (0.333333 * myQuantity);
    }    

    public int getquantity()
    {
        return myQuantity;
    }

    public String getFlavor()
    {
        return myFlavor;
    }

    public double getSugar()
    {
        return mySugar;
    }

    public int getCreamCheese()
    {
        return myCreamCheese;
    }

    public int getVanilla()
    {
        return myVanilla;
    }

    public int getServings()
    {
        return myServings;
    }
    
    public String toString()
    {
        return String.format("%10h %14s %14s %11h %11.2f %10h", myQuantity, myFlavor, myCreamCheese, myServings, mySugar, myVanilla);
    }
}